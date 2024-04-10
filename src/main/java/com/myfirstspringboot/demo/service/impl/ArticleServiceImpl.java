package com.myfirstspringboot.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.myfirstspringboot.demo.mapper.ArticleMapper;
import com.myfirstspringboot.demo.pojo.Article;
import com.myfirstspringboot.demo.pojo.PageBean;
import com.myfirstspringboot.demo.service.ArticleService;
import com.myfirstspringboot.demo.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public ArrayList<Article> getAllarticle(String token) {
        Map<String,Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        if(id!=null){
            ArrayList<Article> allArticle = articleMapper.selectAllArticle(id);
            return allArticle;
        }
        return null;
    }

    @Override
    public void add(Article article) {
        Map<String,Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        article.setCreateUser(id);
        article.setCreateTime(LocalDateTime.now());
        article.setUpdateTime(LocalDateTime.now());
        articleMapper.add(article);
    }

    @Override
    public PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state) {
        PageBean<Article> pb = new PageBean<>();
        PageHelper.startPage(pageNum,pageSize);
        Map<String,Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        List<Article> as = articleMapper.list(userId,categoryId,state);
        Page<Article> p = (Page<Article>)as;
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());
        return null;
    }
}
