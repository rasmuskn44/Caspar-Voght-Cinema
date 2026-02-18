package com.RaLe.spring_boot.voting;

import com.RaLe.spring_boot.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VotingRepository extends JpaRepository<Voting, Long> {
    Optional<Voting> findByIsActive(boolean isActive);
}
