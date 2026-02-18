package com.RaLe.spring_boot.voting;

import com.RaLe.spring_boot.movie.MovieResponse;
import com.RaLe.spring_boot.user.UserResponse;

import java.sql.Timestamp;

public record VotingResponse(long id, MovieResponse movieResponse, UserResponse userResponse, boolean isActive, Timestamp creationDate) {
    public VotingResponse(Voting voting) {
        this(voting.getId(), new MovieResponse(voting.getMovie()), new UserResponse(voting.getUser()), voting.isActive(), voting.getCreationDate());
    }
}
