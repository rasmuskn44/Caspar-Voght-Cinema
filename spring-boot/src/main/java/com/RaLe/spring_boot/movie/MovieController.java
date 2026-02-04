package com.RaLe.spring_boot.movie;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@Valid @PathVariable long id){
        Optional<MovieResponse> movieResponse = movieService.getMovie(id);
        if(movieResponse.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Movie not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(movieResponse.get());
    }
}
