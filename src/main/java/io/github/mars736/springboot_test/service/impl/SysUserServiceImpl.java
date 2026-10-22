package io.github.mars736.springboot_test.service.impl;

import io.github.mars736.springboot_test.entity.SysUser;
import io.github.mars736.springboot_test.mappers.SysUserMapper;
import io.github.mars736.springboot_test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser getUserById(Integer id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public List<SysUser> getAllUsers() {
        return sysUserMapper.selectList(null);
    }

    @Override
    public int createUser(SysUser user) {
        return sysUserMapper.insert(user);   }

    @Override
    public int updateUser( SysUser user) {
        return sysUserMapper.updateById(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return sysUserMapper.deleteById(id);
    }
}
