package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FeedbackId")
    private int feedbackId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Feedback")
    private String feedback;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;


}