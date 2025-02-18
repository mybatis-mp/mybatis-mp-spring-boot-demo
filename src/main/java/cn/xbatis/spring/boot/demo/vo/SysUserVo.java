package cn.xbatis.spring.boot.demo.vo;

import cn.xbatis.db.annotations.NestedResultEntity;
import cn.xbatis.db.annotations.ResultEntity;
import cn.xbatis.db.annotations.ResultEntityField;
import cn.xbatis.db.annotations.ResultField;
import cn.xbatis.spring.boot.demo.DO.SysRole;
import cn.xbatis.spring.boot.demo.DO.SysUser;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@ResultEntity(SysUser.class)
public class SysUserVo {

    private Integer id;

    private String name;

    @ResultEntityField(target = SysUser.class, property = "createTime")
    private LocalDateTime create_time;

    @ResultField("copy_name")
    private String copyName;

    @NestedResultEntity(target = SysRole.class)
    private SysRole sysRole;
}
