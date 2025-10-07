package com.sandesh.marketplace.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @NotBlank @Size(min = 2, max = 100) String name,
        @NotBlank @Email @Size(max=200) String email,
        @NotBlank @Size(min = 2, max = 12) String password
) {
}
