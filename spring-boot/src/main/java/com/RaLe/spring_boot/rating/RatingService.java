package com.RaLe.spring_boot.rating;

import java.util.List;
import java.util.Optional;

public class RatingService {
    private final RatingRepository ratingRepository;

    public RatingService (RatingRepository ratingRepository){
        this.ratingRepository  = ratingRepository;
    }


}
