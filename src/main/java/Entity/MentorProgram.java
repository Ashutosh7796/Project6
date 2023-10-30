package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "MentorProgram")
public class MentorProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MentorProgramId")
    private int mentorProgramId;

    @Column(name = "ProgramName")
    private String programName;

    @Column(name = "ProgramDetails")
    private String programDetails;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Price")
    private String price;

    @Column(name = "Time")
    private Time time;

    @Column(name = "MentorProgramcol")
    private String mentorProgramcol;

    @ManyToOne
    @JoinColumn(name = "Mentor_MentorId")
    private Mentor mentor;

    @Column(name = "Status")
    private String status;

}