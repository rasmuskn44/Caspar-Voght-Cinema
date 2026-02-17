package com.RaLe.spring_boot.rating;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping()
    public List<RatingResponse> getRatingsByMovie(@Valid @RequestParam long movieId){
        return ratingService.getRatingsByMovie(movieId);
    }
}
