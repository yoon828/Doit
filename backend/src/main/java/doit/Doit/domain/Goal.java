package doit.Doit.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Goal {
    @Id @GeneratedValue
    @Column(name = "goal_id")
    private Long id;
    private String emoji;
    private String title;
    private String color;

}
