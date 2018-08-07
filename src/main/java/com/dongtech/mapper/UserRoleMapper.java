package com.dongtech.mapper;

import com.dongtech.bean.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Fri Aug 03 15:50:08 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Fri Aug 03 15:50:08 CST 2018
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Fri Aug 03 15:50:08 CST 2018
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Fri Aug 03 15:50:08 CST 2018
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Fri Aug 03 15:50:08 CST 2018
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Fri Aug 03 15:50:08 CST 2018
     */
    int updateByPrimaryKey(UserRole record);

    /**
     * 根据用户名查询用户个人信息
     * @param username
     * @return
     */
    Map<String,Object> selectUserProfileByUserName(String username);

    /**
     * 根据用户id和权限id查询角色
     * @param map
     * @return
     */
    UserRole selectUserRoleByUseridAndPermissionid(Map<String,Object> map);

    /**
     * 查询所有角色分配信息
     * @return
     */
    List<Map<String,Object>> selectAllRole();

    /**
     * 根据roleid查询角色信息
     * @param roleid
     * @return
     */
    Map<String,Object> selectRoleByRoleid(Integer roleid);
}