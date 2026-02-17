package com.RaLe.spring_boot.rating;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/{movieId}")
    public List<RatingResponse> getRatingsByMovie(@Valid @PathVariable long movieId){
        return ratingService.getRatingsByMovie(movieId);
    }
}
