package com.bank.repositories;

import com.bank.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface RoleRepository extends JpaRepository<Role,Long> {
    public Role findByRoleName(String roleName);
}
