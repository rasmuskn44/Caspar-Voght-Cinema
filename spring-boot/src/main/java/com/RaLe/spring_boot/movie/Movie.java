package com.RaLe.spring_boot.movie;
import jakarta.persistence.*;

@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
