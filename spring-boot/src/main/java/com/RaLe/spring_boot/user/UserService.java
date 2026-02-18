package com.RaLe.spring_boot.user;

import com.RaLe.spring_boot.security.JwtUtility;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> findById(long userId){
        return userRepository.findById(userId);
    }

    protected Optional<String> authenticate(UserLoginRequest request){
        Optional<User> user = userRepository.findByUsername(request.username());
        if(user.isEmpty()){
            //silly call to generate same runtime
            passwordEncoder.matches(request.password(), "PASSWORD");
            return Optional.empty();
        }

        //if(!passwordEncoder.matches(request.password(), user.get().getPassword())){
        if(!request.password().equals(user.get().getPassword())){
            return Optional.empty();
        }

        return Optional.of(JwtUtility.generateToken(user.get().getId()));
    }
}
