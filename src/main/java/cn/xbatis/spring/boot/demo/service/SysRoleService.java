package cn.xbatis.spring.boot.demo.service;

import cn.xbatis.core.mybatis.mapper.context.Pager;
import cn.xbatis.spring.boot.demo.DO.SysRole;

public interface SysRoleService {

    void save(SysRole sysRole);

    void update(SysRole sysRole);

    int delete(Integer id);

    Pager<SysRole> search(String name,Pager<SysRole> pager);
}
