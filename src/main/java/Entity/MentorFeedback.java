package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MentorFeedback")
public class MentorFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MentorFeedbackId")
    private int mentorFeedbackId;

    @Column(name = "Feedback")
    private String feedback;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private int user;

    @ManyToOne
    @JoinColumn(name = "Mentor_MentorId")
    private Mentor mentor;


}