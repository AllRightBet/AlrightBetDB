package com.MA.AlrightBet.Dao;
import com.MA.AlrightBet.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao  extends JpaRepository<User, Integer> {
    @Query(value = " SELECT * FROM tbl_users WHERE email = :email ", nativeQuery = true)
    Optional<User> findByEmail(String email);

    @Query(value = " SELECT * FROM tbl_users", nativeQuery = true)
    List<User> listAllAccounts();
}
