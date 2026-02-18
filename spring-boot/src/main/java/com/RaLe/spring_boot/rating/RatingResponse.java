package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.movie.MovieResponse;
import com.RaLe.spring_boot.user.UserResponse;

import java.util.List;

public record RatingResponse(Long id, UserResponse user, MovieResponse movie, List<CategoryRatingResponse> categoryRatingResponses) {
    public RatingResponse(Rating rating){
        this(   rating.getId(),
                new UserResponse(rating.getUser()),
                new MovieResponse(rating.getMovie()),
                rating.getRatings().stream().map(CategoryRatingResponse::new).toList());
    }
}
