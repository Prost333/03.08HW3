package by.pvt.hw3.dto;

import javax.management.relation.Role;

public class UserResponse {
    private int id;
    private  String fullname;
    private String login;
    private by.pvt.hw3.domain.Role role;

    public UserResponse(int id, String fullname, String login,by.pvt.hw3.domain.Role role) {
        this.id = id;
        this.fullname = fullname;
        this.login = login;
        this.role = role;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public by.pvt.hw3.domain.Role getRole() {
        return role;
    }

    public void setRole(by.pvt.hw3.domain.Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", login='" + login + '\'' +
                ", role=" + role +
                '}';
    }
}
