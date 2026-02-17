package com.RaLe.spring_boot.user;

import jakarta.persistence.*;

@Entity
@Table(name="cinema_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }
}
