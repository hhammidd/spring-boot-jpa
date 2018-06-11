package com.example.db.sprinbootjpa.repository;

import com.example.db.sprinbootjpa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer>{
}
