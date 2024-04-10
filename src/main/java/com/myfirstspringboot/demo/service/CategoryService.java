package com.myfirstspringboot.demo.service;

import com.myfirstspringboot.demo.pojo.Category;

import java.util.ArrayList;

public interface CategoryService {
    void add(Category category);

    ArrayList<Category> list();

    Category findById(Integer id);

    void update(Category category);
}
