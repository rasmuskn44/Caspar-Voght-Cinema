package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.Category;
import com.RaLe.spring_boot.category.CategoryResponse;
import com.RaLe.spring_boot.movie.Movie;
import com.RaLe.spring_boot.movie.MovieResponse;
import com.RaLe.spring_boot.user.User;
import com.RaLe.spring_boot.user.UserResponse;
import org.aspectj.weaver.patterns.TypeCategoryTypePattern;

import java.util.Calendar;

public record RatingResponse(UserResponse user, MovieResponse movie, CategoryResponse category, int rating) {
    public RatingResponse(Rating rating) {
        this(new UserResponse(rating.getUser()), new MovieResponse(rating.getMovie()), new CategoryResponse(rating.getCategory()), rating.getRating());
    }
}
