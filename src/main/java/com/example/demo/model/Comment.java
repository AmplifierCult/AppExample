package com.example.demo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Comment {
    private String author;
    private String creationDate;
    private String content;
    private Object photo;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        String[] months = {"Янв", "Фев", "Мар", "Апр", "Май", "Июн", "Июл", "Авг", "Сен",
                "Окт", "Ноя", "Дек"};
        GregorianCalendar gCalendar = new GregorianCalendar();
        int year = gCalendar.get(Calendar.DATE);
        String month = months[gCalendar.get(Calendar.MONTH)];
        int date = gCalendar.get(Calendar.DATE);
        int hour = gCalendar.get(Calendar.HOUR);
        int minute = gCalendar.get(Calendar.MINUTE);
        int second = gCalendar.get(Calendar.SECOND);
        creationDate = year + " " + month + " " + date + " " + hour + ":" + minute + " " + second + "c";
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public void start (User user, Comment photo) throws IOException {
        setAuthor(String.format(user.getFirstName(), " ", user.getLastName()));
        System.out.println("Write a comment");
        setContent(new BufferedReader(new InputStreamReader(System.in)).readLine());
        getCreationDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(author, comment.author) && Objects.equals(creationDate, comment.creationDate) && Objects.equals(content, comment.content) && Objects.equals(photo, comment.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, creationDate, content, photo);
    }
}