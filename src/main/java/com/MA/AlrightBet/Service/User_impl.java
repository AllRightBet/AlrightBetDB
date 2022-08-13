package com.MA.AlrightBet.Service;


import com.MA.AlrightBet.Dao.AdminDao;
import com.MA.AlrightBet.Dao.UserDao;
import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class User_impl implements UserService {


    @Autowired
    private UserDao userDao;
    @Autowired
    private AdminDao adminDao;


    @Override
    public List<User> fetch_all_users() {
        return this.userDao.findAll();
    }

    @Override
    public User getUserById(int id) {
        Optional<User> user = this.userDao.findById(id);
        if (user.isEmpty()) {
            return null;
        }
        return user.get();
    }

    @Override
    public User create_user(User user) {
        if( user.isAdmin_role() )
        {
            this.adminDao.save(new Admin(user.getEmail() , user.getAuthProvider() )  );
        }
        return this.userDao.save(user);
    }

    @Override
    public boolean delete_user(int id) {
        Optional<User> q = this.userDao.findById(id);
        if (q.isPresent()) {
            this.userDao.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public User update_user(User user) {
        Optional<User> q = this.userDao.findById(user.getId());
        if (q.isPresent()) {
            this.userDao.save(user);
            return user;
        }
        return null;
    }
}
