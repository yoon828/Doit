package doit.Doit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Todo {
    @Id @GeneratedValue
    private Long id;
    private boolean status;
    private LocalDateTime date;

}
