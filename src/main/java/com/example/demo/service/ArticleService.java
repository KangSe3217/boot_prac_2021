package com.example.demo.service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
        articleRepository.makeTestData();
    }

    public Article writeArticle(String title, String body) {
        return articleRepository.writeArticle(title,body);
    }

    public Article getArticle(int id) {
        return articleRepository.getArticle(id);
    }
    public List<Article> getArticles() {
        return articleRepository.getArticles();
    }

    public void deleteArticle(int id) {
        articleRepository.deleteArticle(id);
    }

    public void modifyArticle(int id, String title, String body) {
        articleRepository.modifyArticle(id,title,body);
    }

}
