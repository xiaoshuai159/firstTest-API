package com.myfirstspringboot.demo.service.impl;

import com.myfirstspringboot.demo.mapper.CategoryMapper;
import com.myfirstspringboot.demo.pojo.Category;
import com.myfirstspringboot.demo.service.CategoryService;
import com.myfirstspringboot.demo.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public void add(Category category) {
        // 为实体的属性赋值
        category.setCreateTime(LocalDateTime.now());
        category.setUpdateTime(LocalDateTime.now());
        Map<String,Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        category.setCreateUser(id);
        categoryMapper.add(category);
    }

    @Override
    public ArrayList<Category> list() {
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");  // 有点类似前端存到sessionStorage里了，字符串形式存进去，取出来再转成想要的格式
        ArrayList<Category> l = categoryMapper.list(id);
        return l;
    }

    @Override
    public Category findById(Integer id) {
        Map<String,Object> map = ThreadLocalUtil.get();
        Integer UserId = (Integer)map.get("id");
        Category c = categoryMapper.findById(id);
        return c;
    }

    @Override
    public void update(Category category) {
        category.setUpdateTime(LocalDateTime.now());
        categoryMapper.update(category);
    }
}
