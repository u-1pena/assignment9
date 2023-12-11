package com.yuichi.ToDoList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface ToDoMapper {
    @Select("SELECT * FROM todos WHERE id = #{id};")
    Optional<ToDo> findById(int id);

}
