package com.RaLe.spring_boot.voting;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/voting")
public class VotingController {

    private final VotingService votingService;

    public VotingController(VotingService votingService) {
        this.votingService = votingService;
    }

    @GetMapping
    public VotingResponse getActiveVoting() {
        Optional<VotingResponse> votingResponse = votingService.getActiveVoting();
        if (votingResponse.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No active voting found!");
        }
        return votingResponse.get();
    }

}
