package com.java.mybatis.service;

import com.java.mybatis.entity.Author;

import java.security.PublicKey;
import java.util.List;

public interface AuthorService {
    List<Author> findAll();

    List<Author> findByName(String name);
}
