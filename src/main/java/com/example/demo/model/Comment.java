package com.example.demo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Comment {
    private User author;
    private Instant creationDate = Instant.now();
    private String content = "";
    private Photo photo;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
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

    @Override
    public String toString() {
        return "Comment{" +
                "author='" + author + '\'' +
                ", creationDate=" + creationDate +
                ", content='" + content + '\'' +
                ", photo=" + photo +
                '}';
    }
}