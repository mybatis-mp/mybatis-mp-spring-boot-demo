package cn.mybatis.mp.spring.boot.demo.service;

import cn.mybatis.mp.core.mybatis.mapper.context.Pager;
import cn.mybatis.mp.spring.boot.demo.DO.SysUser;
import cn.mybatis.mp.spring.boot.demo.vo.SysUserVo;

public interface SysUserService {

    void save(SysUser sysUser);

    void update(SysUser sysUser);

    int delete(Integer id);

    SysUser get(Integer id);

    SysUserVo getUserInfo(Integer id);

    <T> Pager<T> search(String name, Pager<T> pager, Class<T> returnType);
}
