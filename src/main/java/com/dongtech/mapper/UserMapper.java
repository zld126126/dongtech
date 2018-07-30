package com.dongtech.mapper;

import com.dongtech.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    @Select("select * from users where id=#{id}")
    User findUserById(@Param("id") String id);
}
