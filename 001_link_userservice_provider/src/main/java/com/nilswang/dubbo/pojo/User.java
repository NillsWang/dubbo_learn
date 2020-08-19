package com.nilswang.dubbo.pojo;

import java.io.Serializable;

/**
 * @author wangminze
 * @create 2020-08-18-19:29
 */
public class User implements Serializable {

    private Integer id;
    private String userName;
    private int userAge;

    public User() {
    }

    public User(Integer id, String userName, int userAge) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
