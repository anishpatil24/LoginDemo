package com.logindemo.logindemo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "login_credentials")
public class Login {

    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public Login() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
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


    private Userdata userdata;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    public Userdata getUserdata() {
        return userdata;
    }

    public void setUserdata(Userdata userdata) {
        this.userdata = userdata;
    }
}

