package com.MA.AlrightBet.Dao;
import com.MA.AlrightBet.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends JpaRepository<User, Integer> {
}
