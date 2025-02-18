package cn.xbatis.spring.boot.demo.controller;

import cn.xbatis.core.mybatis.mapper.context.Pager;
import cn.xbatis.spring.boot.demo.DO.SysRole;
import cn.xbatis.spring.boot.demo.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequestMapping("/sys/role")
@RestController
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/save")
    public SysRole save(SysRole sysRole) {
        sysRole.setCreateTime(LocalDateTime.now());
        sysRoleService.save(sysRole);
        return sysRole;
    }

    @RequestMapping("/update")
    public SysRole update(SysRole sysRole) {
        sysRole.setCreateTime(LocalDateTime.now());
        sysRoleService.update(sysRole);
        return sysRole;
    }

    @RequestMapping("/delete/{id}")
    public int delete(@PathVariable Integer id) {
        return sysRoleService.delete(id);
    }


    @RequestMapping("/search")
    public Pager<SysRole> search(String name, Pager<SysRole> pager) {
        return sysRoleService.search(name, pager);
    }
}
