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
 * Created by Igor Ivanov
 */
public interface UsersMapper {

    @Select("SELECT * FROM USERS")
    List<Users> getUserList();

}
