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

}
