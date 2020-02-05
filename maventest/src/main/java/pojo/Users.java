package pojo;

import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 14:52
 */
public class Users {
    private Integer id;
    private String username;
    private String password;
    private int type;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    Users(){
        System.out.println("无参构造方法");
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("有参构造方法"+username+password);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
