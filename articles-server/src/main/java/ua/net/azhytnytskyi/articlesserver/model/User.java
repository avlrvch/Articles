package ua.net.azhytnytskyi.articlesserver.model;

import ua.net.azhytnytskyi.articlesserver.enums.UserRole;

import java.util.Set;

public class User {

    private Long id;

    private Set<Article> userArticles;

    private UserRole userRole;

}
