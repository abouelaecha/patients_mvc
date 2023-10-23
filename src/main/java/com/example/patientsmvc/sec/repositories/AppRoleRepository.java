package com.example.patientsmvc.sec.repositories;

import com.example.patientsmvc.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long>{
    AppRole findByRoleName(String roleName);

}
