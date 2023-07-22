package com.dera.spring.test.cronjob.dao;



import com.dera.spring.test.cronjob.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserModel, Integer> {
    
    
}

