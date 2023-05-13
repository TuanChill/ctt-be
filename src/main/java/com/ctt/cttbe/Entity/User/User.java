package com.ctt.cttbe.Entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {
    @Id
    private String msv;
    @Column(nullable = false)
    private String name;
    private Timestamp birthday;
    @Column(name= "class_id")
    private int classId;
    @Column(name = "phone")
    private String phoneNumber;
    private String gender;
    @Column(name = "cccd")
    private String CCCD;
    private String email;
    private String address;

}
