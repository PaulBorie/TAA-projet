package sample.data.jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("TraditionalClass")
public class TraditionalClass extends Meeting implements Serializable {

    private String building;
    private Integer room;


    public TraditionalClass() {}

    public TraditionalClass(String title, LocalDateTime date, Integer duration, String description, String building, Integer room) {
        super(title, date, duration, description);
        this.building = building;
        this.room = room;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }


    @Override
    public String toString() {
        return "OnlineClass{" +
                "id=" + super.getId() +
                ", title='" + super.getTitle() + '\'' +
                ", Date=" + super.getDate() +
                ", duration=" + super.getDuration() +
                ", description='" + super.getDescription() + '\'' +
                ", building='" + building + '\'' +
                ", room=" + room +
                '}';

    }
}
