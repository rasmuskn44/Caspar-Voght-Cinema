package com.RaLe.spring_boot.rating;

public record RatingResponse(long id, long userId, long movieId, long category, int rating) {
    public RatingResponse(Rating rating){
        this(rating.getId(), rating.getUserId(), rating.getMovieId(), rating.getCategory(), rating.getRating());
    }
}
