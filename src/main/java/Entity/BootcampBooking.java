package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "BootcampBooking")
public class BootcampBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BootcampBookingsId")
    private int bookingId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "Status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "bootcamp_bootcampId")
    private Bootcamp bootcamp;


}