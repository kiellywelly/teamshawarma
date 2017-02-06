package com.teamshawarma.trial.Entity;

import java.util.List;

/**
 * Created by Brian on 2/6/2017.
 */
public class User {
    private Long id;
    private String name, password;
    private double aveGrade;
//    private List<ListItem> listScholarships;


    public User(Long id, String name, String password, double aveGrade){
        this.id = id;
        this.name = name;
        this.password = password;
        this.aveGrade = aveGrade;
//        listScholarships = new Collection<ListItem>;
    }
    public User(){}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAveGrade() {
        return aveGrade;
    }

    public void setAveGrade(double aveGrade) {
        this.aveGrade = aveGrade;
    }

//

}
