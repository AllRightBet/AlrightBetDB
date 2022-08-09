package com.MA.AlrightBet.Service;

import com.MA.AlrightBet.Dao.AdminDao;
import com.MA.AlrightBet.Dao.BetDao;
import com.MA.AlrightBet.Dao.FightCardDao;
import com.MA.AlrightBet.Dao.UserDao;
import com.MA.AlrightBet.Entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Admin_impl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private BetDao betDao;

    @Autowired
    private FightCardDao fightCardDao;


    @Override
    public List<Admin> fetch_all_admins() {
        return null;
    }

    @Override
    public Admin create_admin() {
        return null;
    }

    @Override
    public void delete_admin() {

    }

    @Override
    public Admin update_admin() {
        return null;
    }
}
