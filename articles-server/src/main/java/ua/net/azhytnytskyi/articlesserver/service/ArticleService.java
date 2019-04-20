package ua.net.azhytnytskyi.articlesserver.service;


import ua.net.azhytnytskyi.articlesserver.model.Article;

import java.util.List;

public interface ArticleService {

    Article saveArticle(Article article);
    Article getArticleById(Long id);
    void deleteArticle(Long id);
    List<Article> getArticles();

}
