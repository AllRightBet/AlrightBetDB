package com.MA.AlrightBet.Service;


import com.MA.AlrightBet.Dao.AdminDao;
import com.MA.AlrightBet.Dao.BetDao;
import com.MA.AlrightBet.Dao.FightCardDao;
import com.MA.AlrightBet.Dao.UserDao;
import com.MA.AlrightBet.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_impl implements UserService {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private BetDao betDao;

    @Autowired
    private FightCardDao fightCardDao;


    @Override
    public List<User> fetch_all_users() {
        return null;
    }

    @Override
    public User create_user() {
        return null;
    }

    @Override
    public void delete_user() {

    }

    @Override
    public User update_user() {
        return null;
    }
}
