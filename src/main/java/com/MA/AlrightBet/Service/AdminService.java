package com.MA.AlrightBet.Service;
import com.MA.AlrightBet.Entity.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> fetch_all_admins();
    public Admin create_admin();
    public void delete_admin();
    public Admin update_admin();
}
