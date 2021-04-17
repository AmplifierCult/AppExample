package com.example.demo.model;

import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;

public class Photo {
    private long id;
    private Instant creationDate = Instant.now();
    private String name;
    private byte [] data;
    private User author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte [] getData() {
        return data;
    }

    public void setData(byte [] data) {
        this.data = data;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return id == photo.id && Objects.equals(creationDate, photo.creationDate) && Objects.equals(name, photo.name) && Arrays.equals(data, photo.data) && Objects.equals(author, photo.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate, name, Arrays.hashCode(data), author);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", name='" + name + '\'' +
                ", data=" + Arrays.toString(data) +
                ", author=" + author +
                '}';
    }
}
