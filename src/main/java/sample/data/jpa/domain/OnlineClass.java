package sample.data.jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("OnlineClass")
public class OnlineClass extends Meeting implements Serializable {

    public OnlineClass() {}

    public OnlineClass(String title, LocalDateTime date, Integer duration, String description) {
        super(title, date, duration, description);
    }

}
