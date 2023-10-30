package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "EventBooking")
public class EventBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventBookingId")
    private int bookingId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "Status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "Events_Eventsid")
    private Event event;

}