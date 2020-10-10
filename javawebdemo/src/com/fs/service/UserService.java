package com.fs.service;

import com.fs.common.ResponseCode;
import com.fs.pojo.Product;
import com.fs.pojo.Users;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:16
 */
public interface UserService {

    ResponseCode<Users> login(String username,String password);

    ResponseCode<Users> register(String username, String password);
}
