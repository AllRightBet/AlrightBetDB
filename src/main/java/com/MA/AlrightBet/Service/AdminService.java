package com.MA.AlrightBet.Service;
import com.MA.AlrightBet.Entity.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> fetch_all_admins();
    public Admin getAdminById(int id);
    public Admin create_admin(Admin admin);
    public boolean delete_admin(int id);
    public Admin update_admin(Admin admin);
}
