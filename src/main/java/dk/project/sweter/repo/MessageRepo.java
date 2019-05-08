package dk.project.sweter.repo;

import dk.project.sweter.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * DAO для работы с сообщениями пользователей
 *
 * @author dkom91
 */
public interface MessageRepo extends JpaRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
