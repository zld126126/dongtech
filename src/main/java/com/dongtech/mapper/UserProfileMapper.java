package com.dongtech.mapper;

import com.dongtech.bean.UserProfile;
import org.apache.ibatis.annotations.Mapper;

public interface UserProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userprofile
     *
     * @mbggenerated Fri Aug 03 15:54:36 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userprofile
     *
     * @mbggenerated Fri Aug 03 15:54:36 CST 2018
     */
    int insert(UserProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userprofile
     *
     * @mbggenerated Fri Aug 03 15:54:36 CST 2018
     */
    int insertSelective(UserProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userprofile
     *
     * @mbggenerated Fri Aug 03 15:54:36 CST 2018
     */
    UserProfile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userprofile
     *
     * @mbggenerated Fri Aug 03 15:54:36 CST 2018
     */
    int updateByPrimaryKeySelective(UserProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userprofile
     *
     * @mbggenerated Fri Aug 03 15:54:36 CST 2018
     */
    int updateByPrimaryKey(UserProfile record);

    /**
     * 根据用户infoid查询用户信息
     */
    UserProfile selectUserProfileByUserInfoId(Integer userid);
}