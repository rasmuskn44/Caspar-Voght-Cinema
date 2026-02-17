package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.Category;
import com.RaLe.spring_boot.movie.Movie;
import com.RaLe.spring_boot.user.User;
import jakarta.persistence.*;
import jdk.jfr.Unsigned;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RatingKey implements Serializable {
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false)
    private Movie movie;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;

    public User getUser() {return user;}

    public Movie getMovie() {
        return movie;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof RatingKey keyToCompare)) return false;
        return  Objects.equals(user, keyToCompare.getUser()) &&
                Objects.equals(movie, keyToCompare.getMovie()) &&
                Objects.equals(category, keyToCompare.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, movie, category);
    }
}
