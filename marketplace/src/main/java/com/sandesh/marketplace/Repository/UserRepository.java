package com.sandesh.marketplace.Repository;

import com.sandesh.marketplace.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // user repository includes check if email exists and findUser by email

    boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);

}
