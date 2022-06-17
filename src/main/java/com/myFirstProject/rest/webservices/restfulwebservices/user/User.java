package com.myFirstProject.rest.webservices.restfulwebservices.user;

import net.minidev.json.annotate.JsonIgnore;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2)
    private String name;


    @Past
    private Date DOB;




    @OneToMany(mappedBy = "user")
    private List<Post> posts;
    
    public User() {
    }

    public User (Integer id, String name, Date DOB){
        super();
        this.id = id;
        this.name = name;
        this.DOB = DOB;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
