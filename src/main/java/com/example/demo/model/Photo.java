package com.example.demo.model;

import java.util.Objects;

public class Photo {
    private long id;
    private String creationDate;
    private String name;
    private String data;
    private String author;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return id == photo.id && Objects.equals(creationDate, photo.creationDate) && Objects.equals(name, photo.name) && Objects.equals(data, photo.data) && Objects.equals(author, photo.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate, name, data, author);
    }
}
