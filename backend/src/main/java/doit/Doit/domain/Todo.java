package doit.Doit.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Todo {
    @Id @GeneratedValue
    @Column(name = "todo_id")
    private Long id;
    private boolean status;
    private LocalDateTime date;

}
