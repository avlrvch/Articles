package ua.net.azhytnytskyi.articlesserver.model;

import ua.net.azhytnytskyi.articlesserver.enums.UserRole;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue()
    private Long id;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Article> userArticles;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole userRole;

    @Column(name = "username", unique = true, nullable = false, length = 45)
    private String userName;

    @Column(name = "password", nullable = false, length = 60)
    private String userPassword;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public Set<Article> getUserArticles() {
        return userArticles;
    }

    public void setUserArticles(Set<Article> userArticles) {
        this.userArticles = userArticles;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
