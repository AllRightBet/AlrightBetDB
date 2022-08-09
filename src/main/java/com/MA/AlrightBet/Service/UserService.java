package com.MA.AlrightBet.Service;

import com.MA.AlrightBet.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> fetch_all_users();
    public User getUserById(int id);
    public User create_user(User user);
    public Boolean delete_user(int id);
    public User update_user(User user);

}
