package io.github.mars736.springboot_test.controller;

import io.github.mars736.springboot_test.common.Result;
import io.github.mars736.springboot_test.entity.SysUser;
import io.github.mars736.springboot_test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping
    public Result<Integer> createUser(@RequestBody SysUser user) {
        int num;
        if(((num=sysUserService.createUser(user)) )> 0)
        {
            return Result.success(num);
        }
        return Result.error("Failed to create user");
    }

    @DeleteMapping("/{id}")
    public Result<Integer> deleteUser(@PathVariable Integer id) {
        int num = sysUserService.deleteUser(id);
        if(num > 0) {
            return Result.success(num);
        }
        return Result.error("Failed to delete user");
    }

    @PutMapping
    public Result<Integer> updateUser(@RequestBody SysUser user) {
        int num = sysUserService.updateUser(user);
        if(num > 0) {
            return Result.success(num);
        }
        return Result.error("Failed to update user");
    }

    @GetMapping("/{id}")
    public Result<SysUser> getUserById(@PathVariable Integer id) {
        SysUser user = sysUserService.getUserById(id);
        if(user != null) {
            return Result.success(user);
        }
        return Result.error("User not found");
    }

    @GetMapping
    public Result<List<SysUser>> getAllUsers() {
        List<SysUser> users = sysUserService.getAllUsers();
        if(users == null) {
            return Result.error("No users found");
        }
        return Result.success(users);
    }
}
