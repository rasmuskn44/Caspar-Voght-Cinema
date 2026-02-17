package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByMovieId(long movieId);
}
