package com.codecool.model;

import java.util.Date;

public class Tweet {
    
    private String name;
    private String comment;
    private Date date;
    private int id;
    private static int counter = 0;

    
    public Tweet(String name, String comment, Date date) {
        this.name = name;
        this.comment = comment;
        this.date = date;
        this.id = ++counter;
    }
    
    public String getName() {
        return name;
    }
    
    public String getComment() {
        return comment;
    }
    
    public Date getDate() {
        return date;
    }
    
    public int getId() {
        return id;
    }
}
