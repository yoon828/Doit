package doit.Doit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Calendar {
    @Id @GeneratedValue
    private Long id;
    private String img_url;
    private LocalDateTime date;
}
