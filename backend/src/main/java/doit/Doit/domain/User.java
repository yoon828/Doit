package doit.Doit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String nickname;
    private LocalDateTime join_date;
    private List<Goal> goals;

}
