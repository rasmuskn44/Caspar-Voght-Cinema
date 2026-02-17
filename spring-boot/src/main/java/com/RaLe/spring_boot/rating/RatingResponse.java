package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.Category;
import com.RaLe.spring_boot.category.CategoryResponse;
import com.RaLe.spring_boot.movie.Movie;
import com.RaLe.spring_boot.movie.MovieResponse;
import com.RaLe.spring_boot.user.User;
import com.RaLe.spring_boot.user.UserResponse;
import org.aspectj.weaver.patterns.TypeCategoryTypePattern;

import java.util.Calendar;
import java.util.List;

public record RatingResponse(Long id, UserResponse user, MovieResponse movie, List<CategoryRatingResponse> categoryRatingResponses) {
    public RatingResponse(Rating rating){
        this(   rating.getId(),
                new UserResponse(rating.getUser()),
                new MovieResponse(rating.getMovie()),
                rating.getRatings().stream().map(CategoryRatingResponse::new).toList());
    }
}
