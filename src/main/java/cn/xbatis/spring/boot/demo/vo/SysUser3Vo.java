package cn.xbatis.spring.boot.demo.vo;

import cn.xbatis.db.annotations.ResultEntity;
import cn.xbatis.db.annotations.ResultEntityField;
import cn.xbatis.db.annotations.ResultField;
import cn.xbatis.spring.boot.demo.DO.SysRole;
import cn.xbatis.spring.boot.demo.DO.SysUser;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@ResultEntity(SysUser.class)
public class SysUser3Vo {

    private Integer id;

    private String name;

    @ResultEntityField(target = SysUser.class, property = "createTime")
    private LocalDateTime create_time;

    @ResultField("copy_name")
    private String copyName;

    @ResultEntityField(target = SysRole.class, property = "id")
    private Integer roleId;

    @ResultEntityField(target = SysRole.class, property = "name")
    private String roleName;
}
