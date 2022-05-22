package com.fsoft.Model.User;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(length = 15,nullable = false)
    private String username;
    @Column(length = 15,nullable = false)
    private String password;

    private int typeofuserid;
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


    public int getTypeofuserid() {
        return typeofuserid;
    }

    public void setTypeofuserid(int typeofuserid) {
        this.typeofuserid = typeofuserid;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", typeofuserid=" + typeofuserid +
                '}';
    }
}
