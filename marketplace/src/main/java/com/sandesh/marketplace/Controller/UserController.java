package com.sandesh.marketplace.Controller;

import com.sandesh.marketplace.DTO.UserRequest;
import com.sandesh.marketplace.DTO.UserResponse;
import com.sandesh.marketplace.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service= service;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse create(@Valid @RequestBody UserRequest req){
        return service.create(req);
    }

    @GetMapping
    public List<UserResponse> getAllUsers(){
        return service.getAllUsers();
    }

}
