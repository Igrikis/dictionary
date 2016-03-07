package com.project.vocabulary.persistence;

import com.project.vocabulary.entity.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Created by Igor Ivanov on 07.03.2016.
 */
public interface UsersMapper {

    @Select("SELECT * FROM USERS")
    List<Users> getUserList();

    @Select("SELECT * FROM USERS WHERE ID = #{id}")
    Users getUserById(@Param("ID") BigInteger id);

    Users getUserDetailById(Map<String, Object> params);

    int updateUserDetailsById(Map<String, Object> params);

    @Update("UPDATE USERS SET EMAIL = #{email} WHERE ID = #{id}")
    int updateUserEmailById(@Param("ID") BigInteger id,@Param("EMAIL") String email);

    @Delete("DELETE FROM USERS WHERE ID = #{id}")
    int deleteUserById(@Param("ID") BigInteger id);

}
