package ua.net.azhytnytskyi.articlesserver.repository;

import org.springframework.data.repository.CrudRepository;
import ua.net.azhytnytskyi.articlesserver.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
