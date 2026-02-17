package com.RaLe.spring_boot.movie;
import jakarta.persistence.*;

@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
