package com.MA.AlrightBet.Service;

import com.MA.AlrightBet.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> fetch_all_users();
    public User create_user();
    public void delete_user();
    public User update_user();

}
