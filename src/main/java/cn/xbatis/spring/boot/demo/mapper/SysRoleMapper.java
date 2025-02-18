package cn.xbatis.spring.boot.demo.mapper;

import cn.xbatis.core.mybatis.mapper.MybatisMapper;
import cn.xbatis.spring.boot.demo.DO.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2023-11-16
 */
@Mapper
public interface SysRoleMapper extends MybatisMapper<SysRole> {

}
