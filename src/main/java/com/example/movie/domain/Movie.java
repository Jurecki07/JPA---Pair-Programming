package com.example.movie.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name ="movie")


public class Movie {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return id == movie.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    private int id;
    private String title;
    private LocalDate releaseDate;
    private Genre genre;
    private boolean color;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id; }



    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title; }


    public void setTitle(String title) {
        this.title = title; }


@Column(name = "release_date")
    public LocalDate getReleaseDate() {
        return releaseDate; }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate; }

    public Genre getGenre() {
        return genre; }

    public void setGenre(Genre genre) {
        this.genre = genre; }


    public boolean isColor() {
        return color; }


    public void setColor(boolean color) {
        this.color = color; }
}
