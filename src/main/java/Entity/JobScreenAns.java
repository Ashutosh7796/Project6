package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "JobScreenAns")
public class JobScreenAns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JobScreenAns")
    private int jobScreenAnsId;

    @Column(name = "Question")
    private String question;

    @Column(name = "Ans")
    private String answer;

    @Column(name = "Type")
    private String type;

    @Column(name = "UserId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "JobId")
    private Job job;

    @Column(name = "seatNO")
    private String seatNo;


}