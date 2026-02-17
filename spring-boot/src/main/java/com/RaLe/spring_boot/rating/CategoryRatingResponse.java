package com.RaLe.spring_boot.rating;

import com.RaLe.spring_boot.category.CategoryResponse;

public record CategoryRatingResponse(CategoryResponse categoryResponse, int value) {
    public CategoryRatingResponse(RatingCategory categoryRating) {
        this(new CategoryResponse(categoryRating.getCategory()), categoryRating.getValue());
    }
}
