package com.RaLe.spring_boot.category;

public record CategoryResponse(long id, String category) {
    public CategoryResponse(Category category) {
        this(category.getId(), category.getCategory());
    }
}
