package ua.net.azhytnytskyi.articlesserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.net.azhytnytskyi.articlesserver.model.Article;
import ua.net.azhytnytskyi.articlesserver.repository.ArticleRepository;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public void deleteArticle(Long id) {
        Article article = articleRepository.findById(id).get();
        articleRepository.delete(article);
    }

    @Override
    public List<Article> getArticles() {
        return (List<Article>) articleRepository.findAll();
    }
}
