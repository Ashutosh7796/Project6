package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "StudentApplications")
public class StudentApplications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentApplicationsId")
    private int studentApplicationsId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Time")
    private java.sql.Time time;

    @Column(name = "RecuterNote")
    private String recruiterNote;

    @ManyToOne
    @JoinColumn(name = "JobId")
    private Job job;

    @Column(name = "StudentApplicationscol")
    private String studentApplicationscol;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    // Getters and setters
}