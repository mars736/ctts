package io.github.mars736.springboot_test.service;

import io.github.mars736.springboot_test.entity.SysUser;

import java.util.List;

public interface SysUserService {
    public SysUser getUserById(Integer id);
    public List<SysUser> getAllUsers();
    public int createUser(SysUser user);
    public int updateUser(SysUser user);
    public int deleteUser(Integer id);
}
