package com.example.api.repository;

import com.example.api.model.User;
import com.example.api.model.Role;
import com.example.api.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

public interface RoleRepository extends JpaRepository<Role, Long> {
}

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
