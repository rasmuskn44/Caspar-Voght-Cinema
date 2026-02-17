package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.Category;
import com.RaLe.spring_boot.movie.Movie;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.util.List;

@Entity
@Table(name="Rating")
public class Rating {

    @EmbeddedId
    private RatingKey ratingKey;
    @Min(0)
    @Max(10)
    private int rating;

    public long getUserId() {
        return ratingKey.getUserId();
    }

    public Movie getMovie() {
        return ratingKey.getMovie();
    }

    public Category getCategory() {
        return ratingKey.getCategory();
    }

    public int getRating() {
        return rating;
    }
}
