package ua.net.azhytnytskyi.articlesserver.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue()
    private Long id;

    @Column(name = "category_title")
    private String categoryTitle;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private Set<Article> categoryArticles;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public Set<Article> getCategoryArticles() {
        return categoryArticles;
    }

    public void setCategoryArticles(Set<Article> categoryArticles) {
        this.categoryArticles = categoryArticles;
    }
}
