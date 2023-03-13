package doit.Doit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Goal {
    @Id @GeneratedValue
    private Long id;
    private String emoji;
    private String title;
    private String color;

}
