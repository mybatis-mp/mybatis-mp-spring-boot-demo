package cn.xbatis.spring.boot.demo.service.impl;

import cn.xbatis.core.mybatis.mapper.context.Pager;
import cn.xbatis.spring.boot.demo.DO.SysRole;
import cn.xbatis.spring.boot.demo.dao.SysRoleDao;
import cn.xbatis.spring.boot.demo.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    @Transactional
    public void save(SysRole sysRole) {
        sysRoleDao.save(sysRole);
    }

    @Override
    @Transactional
    public void update(SysRole sysRole) {
        sysRoleDao.update(sysRole);
    }

    @Override
    @Transactional
    public int delete(Integer id) {
        return sysRoleDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Pager<SysRole> search(String name, Pager<SysRole> pager) {
        return sysRoleDao.search(name, pager);
    }
}
