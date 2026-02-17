package com.RaLe.spring_boot.category;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String category;

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}
