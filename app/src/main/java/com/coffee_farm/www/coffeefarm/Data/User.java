package com.coffee_farm.www.coffeefarm.Data;

/**
 * Created by the on 2017-12-05.
 */

public class User {

    private int id;
    private String login_id;
    private String password;
    private String name;
    private String email;
    private String address;
    private String phone;

    public User() {
    }

    public User(int id, String login_id, String password, String name, String email, String address, String phone) {
        this.id = id;
        this.login_id = login_id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
