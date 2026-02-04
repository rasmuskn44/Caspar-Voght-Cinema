package com.RaLe.spring_boot.movie;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }
    protected Optional<MovieResponse> getMovie(long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if(!movie.isPresent()){
            return Optional.empty();
        }
        return Optional.of(new MovieResponse(movie.get()));
    }
}
