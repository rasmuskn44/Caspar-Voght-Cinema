package com.RaLe.spring_boot.voting;

import com.RaLe.spring_boot.movie.Movie;
import com.RaLe.spring_boot.movie.MovieResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VotingService {

    private final VotingRepository votingRepository;

    public VotingService(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    protected Optional<VotingResponse> getActiveVoting() {
        Optional<Voting> voting = votingRepository.findByIsActive(true);
        return voting.map(VotingResponse::new);
    }
}
