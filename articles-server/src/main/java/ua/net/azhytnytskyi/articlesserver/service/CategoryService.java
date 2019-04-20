package ua.net.azhytnytskyi.articlesserver.service;

import ua.net.azhytnytskyi.articlesserver.model.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(Category category);
    Category getCategoryById(Long id);
    void deleteCategory(Long id);
    List<Category> getCategories();

}
