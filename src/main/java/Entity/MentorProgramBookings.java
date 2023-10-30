package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "MentorProgramBookings")
public class MentorProgramBookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MentorProgramBookingsId")
    private int mentorProgramBookingsId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "UserId")
    private User user;

    @Column(name = "MentorProgramBookingscol")
    private String mentorProgramBookingscol;

    @ManyToOne
    @JoinColumn(name = "MentorProgram_MentorProgramId")
    private MentorProgram mentorProgram;


}