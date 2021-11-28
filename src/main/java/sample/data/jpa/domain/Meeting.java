package sample.data.jpa.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "meetingBetweenTwoDates", query = "select m from Meeting as m where m.date between :d1 and :d2")
public abstract class Meeting implements Serializable {

    private Long id;
    private String title;
    private LocalDateTime Date;
    private Integer duration;
    private String description;
    private User user;
    private Professional professional;

    public Meeting() {}

    public Meeting(String title, LocalDateTime date, Integer duration, String description) {
        this.title = title;
        this.Date = date;
        this.duration = duration;
        this.description = description;

    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "TIMESTAMP")
    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne()
    @JsonBackReference
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

     @ManyToOne()
     @JsonBackReference
     public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Date=" + Date +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }
}
