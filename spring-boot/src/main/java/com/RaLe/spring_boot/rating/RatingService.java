package com.RaLe.spring_boot.rating;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RatingService {
    private final RatingRepository ratingRepository;
    public RatingService (RatingRepository ratingRepository){
        this.ratingRepository  = ratingRepository;
    }

    @Transactional
    protected List<RatingResponse> getRatingsByMovie(long movieId){
        return ratingRepository.findByMovieId(movieId).stream().map(RatingResponse::new).toList();
    }

}
