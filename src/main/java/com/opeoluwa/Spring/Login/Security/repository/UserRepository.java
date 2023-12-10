package com.opeoluwa.Spring.Login.Security.repository;

import com.opeoluwa.Spring.Login.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


}
