package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
