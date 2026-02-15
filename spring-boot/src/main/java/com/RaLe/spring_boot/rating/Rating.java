package com.RaLe.spring_boot.rating;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private long userId;
    @Column(nullable = false)
    private long movieId;
    @Column(nullable = false)
    private long category;
    @Min(0)
    @Max(10)
    private int rating;

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public long getMovieId() {
        return movieId;
    }

    public long getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }
}
