package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.Category;
import com.RaLe.spring_boot.movie.Movie;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RatingKey implements Serializable {
    @Column(nullable = false)
    private Long userId;
    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false)
    private Movie movie;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;

    public Long getUserId() {
        return userId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof RatingKey)) return false;

        RatingKey keyToCompare = (RatingKey) object;
        return  Objects.equals(userId, keyToCompare.getUserId()) &&
                Objects.equals(movie, keyToCompare.getMovie()) &&
                Objects.equals(category, keyToCompare.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, movie, category);
    }
}
