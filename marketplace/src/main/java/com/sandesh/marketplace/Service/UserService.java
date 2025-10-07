package com.sandesh.marketplace.Service;

import com.sandesh.marketplace.DTO.UserRequest;
import com.sandesh.marketplace.DTO.UserResponse;
import com.sandesh.marketplace.Model.UserEntity;
import com.sandesh.marketplace.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;


@Transactional
@Service
public class UserService {
    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;

    public UserService( UserRepository userRepo, PasswordEncoder passwordEncoder){
        this.userRepo= userRepo;
        this.passwordEncoder= passwordEncoder;
    }

    public UserResponse create(UserRequest req) {
        if (userRepo.existsByEmail(req.email())) {
            throw new IllegalArgumentException("Email already in use");
        }
        var user = UserEntity.builder()
                .name(req.name())
                .email(req.email())
                .passwordHash(passwordEncoder.encode(req.password()))
                .role("USER")
                .build();
        var saved = userRepo.save(user);
        return new UserResponse(saved.getId(), saved.getName(), saved.getEmail(), saved.getRole());
    }

    @Transactional
    public List<UserResponse> getAllUsers(){
        return userRepo.findAll().stream().map(u-> new UserResponse(u.getId(), u.getName(), u.getEmail(), u.getRole())).toList();
    }






}



