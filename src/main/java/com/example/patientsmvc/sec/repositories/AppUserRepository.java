package com.example.patientsmvc.sec.repositories;

import com.example.patientsmvc.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>{
    AppUser findByUsername(String username);

}
