package com.example.demo.user;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT id, name, email, password FROM users WHERE name = #{name}")
    User getUser(String name);

    @Select("SELECT id, name, email, password FROM users")
    List<User> getUsers();

    @Insert("INSERT INTO users (name, email, password) VALUES (#{name}, #{email}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    void insertUser(User user);

    void updateUser(User user);
    void deleteUser(String name);
}
