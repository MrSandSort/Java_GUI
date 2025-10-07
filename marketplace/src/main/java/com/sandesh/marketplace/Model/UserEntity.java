package com.sandesh.marketplace.Model;

import java.net.ProtocolFamily;
import java.time.OffsetDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="users")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder

public class UserEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length=100)
    private String name;

    @Column(nullable = false, unique = true, length = 200)
    private String email;

    @Column(name="password_hash", nullable=false, length = 255)
    private String passwordHash;

    @Column(nullable = false, length = 30)
    private String role="USER";

    @CreationTimestamp
    @Column(name="created_at", nullable=false, updatable = false)
    private OffsetDateTime createdAt= OffsetDateTime.now();

    @UpdateTimestamp
    @Column(name="updated_at", nullable = false)
    private OffsetDateTime updatedAt= OffsetDateTime.now();

   
}
