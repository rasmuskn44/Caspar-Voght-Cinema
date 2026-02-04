package com.RaLe.spring_boot.movie;

public record MovieResponse(long id, String title) {
    public MovieResponse (Movie movie){
        this(movie.getId(), movie.getTitle());
    }
}
