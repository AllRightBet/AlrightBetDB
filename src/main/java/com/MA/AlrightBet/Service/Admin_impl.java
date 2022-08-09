package com.MA.AlrightBet.Service;

import com.MA.AlrightBet.Dao.AdminDao;
import com.MA.AlrightBet.Dao.BetDao;
import com.MA.AlrightBet.Dao.FightCardDao;
import com.MA.AlrightBet.Dao.UserDao;
import com.MA.AlrightBet.Entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Admin_impl implements AdminService {
    @Autowired
    private AdminDao adminDao;


    @Override
    public List<Admin> fetch_all_admins() {
        return this.adminDao.findAll();
    }

    @Override // GET --> /courses/{id}
    public Admin getAdminById(int id) {
        Optional<Admin> a = this.adminDao.findById(id);
        if (a.isEmpty()) {
            return null;
        }
        return a.get();
    }

    @Override
    public Admin create_admin(Admin admin) {
        return this.adminDao.save(admin);
    }

    @Override
    public void delete_admin(int id) {
        this.adminDao.deleteById(id);
    }

    @Override
    public Admin update_admin(Admin admin) {
        Optional<Admin> q = this.adminDao.findById(admin.getId());
        if (q.isPresent()) {
            this.adminDao.save(admin);
            return admin;
        }
        return null;
    }

}
