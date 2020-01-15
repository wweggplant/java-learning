package com.server.sso.dao;

import java.util.List;

import com.model.User;

import org.apache.ibatis.annotations.*;

/**
 * UserDao
 */
@Mapper
public interface UserDao {

    @Select("SELECT * FROM user WHERE name = #{name}")
    User FindUserByName(@Param("name") String name);

    @Select("SELECT * FROM user")
    List<User> findAllUser();

    @Insert("INSERT INTO user(name, age, money) VALUE(#{name}, #{age}, #{money})")
    void insertUser(@Param("name") String name, @Param("age") int age, @Param("money") double money);

    @Update("UPDATE  user SET name = #{name},age = #{age},money= #{money} WHERE id = #{id}")
    void updateUser(@Param("name") String name, @Param("age") int age, @Param("money") double money, @Param("id") int id);

    @Delete("DELETE from user WHERE id = #{id}")
    void deleteUser(@Param("id") int id);
}