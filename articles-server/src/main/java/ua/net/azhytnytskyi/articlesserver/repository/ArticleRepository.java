package ua.net.azhytnytskyi.articlesserver.repository;

import org.springframework.data.repository.CrudRepository;
import ua.net.azhytnytskyi.articlesserver.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
