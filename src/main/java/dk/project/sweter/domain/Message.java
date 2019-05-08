package dk.project.sweter.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * сущность для таблицы сообщений
 * message
 * @author dkom91
 */
@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private String tag;

    /**
     * без данного конструктора Hibernate
     * не сможет создать новую сущность
     */
    public Message() {

    }

    /**
     * @param text
     * @param tag
     */
    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }
}
