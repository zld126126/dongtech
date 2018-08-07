package com.dongtech.mapper;

import com.dongtech.bean.PermissionPath;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionPathMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionpath
     *
     * @mbggenerated Fri Aug 03 15:49:22 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionpath
     *
     * @mbggenerated Fri Aug 03 15:49:22 CST 2018
     */
    int insert(PermissionPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionpath
     *
     * @mbggenerated Fri Aug 03 15:49:22 CST 2018
     */
    int insertSelective(PermissionPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionpath
     *
     * @mbggenerated Fri Aug 03 15:49:22 CST 2018
     */
    PermissionPath selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionpath
     *
     * @mbggenerated Fri Aug 03 15:49:22 CST 2018
     */
    int updateByPrimaryKeySelective(PermissionPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionpath
     *
     * @mbggenerated Fri Aug 03 15:49:22 CST 2018
     */
    int updateByPrimaryKey(PermissionPath record);

    /**
     * 根据permissionnum查询权限路径
     * @param permissionnum
     * @return
     */
    List<PermissionPath> selectPathsByPermissionInfoNum(Integer permissionnum);
}