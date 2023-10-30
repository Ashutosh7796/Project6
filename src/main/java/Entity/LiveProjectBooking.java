package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "LiveProjectBooking")
public class LiveProjectBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LiveProjectBooking")
    private int liveProjectBookingId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Status")
    private String status;

    @Column(name = "UserId")
    private String userId;


}