package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.movie.Movie;
import com.RaLe.spring_boot.user.User;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false)
    private Movie movie;

    @OneToMany(mappedBy = "rating")
    private List<RatingCategory> ratings;

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public Long getId() {
        return id;
    }

    public List<RatingCategory> getRatings() {
        return ratings;
    }

}
