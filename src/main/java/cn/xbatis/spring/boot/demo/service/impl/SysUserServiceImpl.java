package cn.xbatis.spring.boot.demo.service.impl;

import cn.xbatis.core.mybatis.mapper.context.Pager;
import cn.xbatis.spring.boot.demo.DO.SysUser;
import cn.xbatis.spring.boot.demo.dao.SysUserDao;
import cn.xbatis.spring.boot.demo.service.SysUserService;
import cn.xbatis.spring.boot.demo.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void save(SysUser sysUser) {
        sysUser.setCreateTime(LocalDateTime.now());
        sysUserDao.save(sysUser);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserDao.update(sysUser);
    }

    @Override
    public int delete(Integer id) {
        return sysUserDao.deleteById(id);
    }

    @Override
    public SysUser get(Integer id) {
        return sysUserDao.getById(id);
    }

    @Override
    public SysUserVo getUserInfo(Integer id) {
        return sysUserDao.getUserInfo(id);
    }

    @Override
    public <T> Pager<T> search(String name, Pager<T> pager, Class<T> returnType) {
        return sysUserDao.search(name, pager, returnType);
    }
}
