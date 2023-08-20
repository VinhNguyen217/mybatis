package com.java.mybatis.service.impl;

import com.java.mybatis.entity.Author;
import com.java.mybatis.mapper.AuthorMapper;
import com.java.mybatis.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public List<Author> findAll() {
        return authorMapper.findAll();
    }

    @Override
    public List<Author> findByName(String name) {
        return authorMapper.findByName(name);
    }
}
