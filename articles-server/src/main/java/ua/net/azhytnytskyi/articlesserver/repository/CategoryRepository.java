package ua.net.azhytnytskyi.articlesserver.repository;

import org.springframework.data.repository.CrudRepository;
import ua.net.azhytnytskyi.articlesserver.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
