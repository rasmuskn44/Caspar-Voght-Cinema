package com.RaLe.spring_boot.voting;


import com.RaLe.spring_boot.movie.Movie;
import com.RaLe.spring_boot.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;

@Entity
@Table(name = "voting")
public class Voting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="movie_id", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ColumnDefault("true")
    private boolean isActive;

    @ColumnDefault("Current_Timestamp")
    private Timestamp creationDate;

    public Long getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public User getUser() {
        return user;
    }

    public boolean isActive() {
        return isActive;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }
}
