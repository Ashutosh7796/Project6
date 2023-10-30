package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "MentorBookingSchedule")
public class MentorBookingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MentorBookingScheduleId")
    private int mentorBookingScheduleId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Mode")
    private String mode;

    @Column(name = "Time")
    private String time;

    @Column(name = "Payment")
    private String payment;

    @Column(name = "Status")
    private String status;


    @Column(name = "MentorSchedule_MentorScheduleId")
    private int mentorSchedule;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;


}