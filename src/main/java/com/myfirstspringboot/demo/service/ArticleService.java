package com.myfirstspringboot.demo.service;

import com.myfirstspringboot.demo.pojo.Article;
import com.myfirstspringboot.demo.pojo.PageBean;

import java.util.ArrayList;

public interface ArticleService {
    ArrayList<Article> getAllarticle(String token);

    void add(Article article);

    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
