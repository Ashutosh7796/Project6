package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "MentorBookings")
public class MentorBookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MentorBookingsId")
    private int bookingId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "mentorId")
    private int mentorId;


}