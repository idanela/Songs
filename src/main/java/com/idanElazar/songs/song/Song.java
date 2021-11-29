package com.idanElazar.songs.song;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Song {
    @Id
    private String name;
    private String singer;


    public Song() {
    }

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name) && Objects.equals(singer, song.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, singer);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
