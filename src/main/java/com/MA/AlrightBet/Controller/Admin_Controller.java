package com.MA.AlrightBet.Controller;

import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class Admin_Controller {

    @Autowired
    AdminService adminService;


    @GetMapping("/admin")
    public List<Admin> get_all() {
        return this.adminService.fetch_all_admins();
    }

    @GetMapping("/admin/{id}") // GET ID
    public Admin getByID(@PathVariable int id) {
        return this.adminService.getAdminById(id);
    }

    @PostMapping("/admin")
    public Admin create(@RequestBody Admin admin) {
        return this.adminService.create_admin(admin);
    }

    @DeleteMapping("/admin/{id}")
    public boolean delete(@PathVariable int id) {
        return this.adminService.delete_admin(id);
    }

    @PutMapping("/admin")
    public Admin update(@RequestBody Admin admin) {
        return this.adminService.update_admin(admin);
    }


}
