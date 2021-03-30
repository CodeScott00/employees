package com.example.codeclan.relationships.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "files")
public class Files {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private String size;

    @ManyToOne
    @JoinColumn(name = "folders_id", nullable = false)
    private Folders folders;



    private List<Folders> folders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Folders getFolders() {
        return folders;
    }

    public void setFolders(Folders folders) {
        this.folders = folders;
    }

    public Files(String name, String extension, String size, Folders folders) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folders = folders;


        public Files(){}


    }
}
