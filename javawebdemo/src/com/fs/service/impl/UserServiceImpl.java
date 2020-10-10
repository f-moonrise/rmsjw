package com.fs.service.impl;

import com.fs.common.ResponseCode;
import com.fs.dao.UserDao;
import com.fs.pojo.Users;
import com.fs.service.UserService;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:38
 */
public class UserServiceImpl implements UserService {
    private UserDao ud = new UserDao();

    @Override
    public ResponseCode<Users> login(String username, String password) {
        Users users = null;
        //非空判断
        if(username == null || username.equals("")){
            return ResponseCode.toDefeated("用户名为空");
        }
        if(password == null || password.equals("")){
            return ResponseCode.toDefeated("密码为空");
        }

        users = ud.selectByUserNameAndPassword(username, password);
//        System.out.println(users);
        if(users == null){
            return ResponseCode.toDefeated("用户不存在");
        }
        //成功返回成功数据
        return ResponseCode.toSuccess(users);
    }

    @Override
    public ResponseCode<Users> register(String username, String password) {
        // 参数非空判断
        if (username == null || "".equals(username)){
            return ResponseCode.toDefeated("输入错误！");
        }
        if (password == null || "".equals(password)){
            return ResponseCode.toDefeated("输入错误！");
        }

        Users i = ud.selectByUserNameAndPassword(username, password);
        if (i != null){
            return ResponseCode.toDefeated("用户名已存在！");
        }

        int i1 = ud.insertByUserNameAndPassword(username, password);

        // 成功则返回用户数据
        if (i1 == 0){
            return ResponseCode.toDefeated("注册失败！");
        }
        return ResponseCode.toSuccess("注册成功");
    }
}
