package com.example.Keyhub.data.entity.repository;

import com.example.Keyhub.data.entity.Role;
import com.example.Keyhub.data.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
