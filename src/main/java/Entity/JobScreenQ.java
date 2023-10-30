package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "JobScreenQ")
public class JobScreenQ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JobScreenQId")
    private int jobScreenQId;

    @Column(name = "Question")
    private String question;

    @ManyToOne
    @JoinColumn(name = "JobId")
    private Job job;

    @Column(name = "Type")
    private String type;


}