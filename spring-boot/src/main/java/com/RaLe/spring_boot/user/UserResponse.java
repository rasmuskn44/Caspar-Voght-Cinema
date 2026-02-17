package com.RaLe.spring_boot.user;

public record UserResponse(long id, String username) {
    public UserResponse(User user) {
        this(user.getId(), user.getUsername());
    }
}
