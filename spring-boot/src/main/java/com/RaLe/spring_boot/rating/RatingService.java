package com.RaLe.spring_boot.rating;

import java.util.List;
import java.util.Optional;

public class RatingService {
    private final RatingRepository ratingRepository;

    public RatingService (RatingRepository ratingRepository){
        this.ratingRepository  = ratingRepository;
    }

    protected List<Optional<RatingResponse>> getRatingsForMovie(long MovieId){
        //TODO
        return getRatingsForMovie(0,0);
    }

    protected List<Optional<RatingResponse>> getRatingsForMovie(long MovieId, long userId){
        //TODO
        return null;
    }
}
