package Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ExamAns")
public class ExamAns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExamAns")
    private int examAnswerId;

    @Column(name = "Q")
    private String question;

    @Column(name = "ans")
    private String answer;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "SeatNo")
    private String seatNumber;

    @Column(name = "Sub")
    private String subject;

    @Column(name = "Date")
    private Date date;
}


