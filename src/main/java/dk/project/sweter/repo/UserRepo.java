package dk.project.sweter.repo;

import dk.project.sweter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DAO для работы с таблицей пользователей
 *
 * @author dkom91
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
