package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "rating_category")
public class RatingCategory {
    @Id
    @ManyToOne
    @JoinColumn(name="rating_id", nullable = false)
    private Rating rating;
    @Id
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;

    @Column
    @Min(0)
    @Max(10)
    private int value;

    public Category getCategory() {
        return category;
    }

    public int getValue() {
        return value;
    }
}
