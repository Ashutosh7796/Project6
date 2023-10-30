package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventId")
    private int eventId;

    @Column(name = "EventName")
    private String eventName;

    @Column(name = "EventDetails")
    private String eventDetails;

    @Column(name = "EventTagline")
    private String eventTagline;

    @Column(name = "EventDate")
    private Date eventDate;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Status")
    private String status;

    @Column(name = "Photo")
    private String photo;

    @Column(name = "Price")
    private String price;


}