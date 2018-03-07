package com.homeworkspring.example.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document
public class Note {

    @Id
    private String id;
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String date;
    private String user;
    private String text;

    public Note() {}

    public Note(String date, String user, String text) {
        this.date = date;
        this.user = user;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String userId) {
        this.user = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
