package doit.Doit.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class CalendarImg {
    @Id @GeneratedValue
    @Column(name = "img_id")
    private Long id;
    private String img_url;
    private LocalDateTime date;
}
