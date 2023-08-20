package com.java.mybatis.mapper;

import com.java.mybatis.entity.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorMapper {

    List<Author> findAll();

    List<Author> findByName(String name);
}
