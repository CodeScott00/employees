package com.example.codeclan.relationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
//import java.nio.file.Files;
//import java.nio.file.Files;
//import java.nio.file.Files;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
//import java.util.List;
//import java.util.List;

@Entity
@Table(name = "folders")
public class Folders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonIgnoreProperties({"folders"})

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)

    private User user;
    @JsonIgnoreProperties({"folders"})
    @OneToMany(mappedBy = "folders")

//    private List<User> users;
//    private List<Files> files;

    public Folders(String title, User user) {
        this.title = title;
        this.user = user;
//        this.files = new ArrayList<>();
    }

    public Folders(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }

//    public List<Files> getFiles() {
//        return files;
//    }
//
//    public void setFiles(List<Files> files) {
//        this.files = files;
//    }

    //add?
}
