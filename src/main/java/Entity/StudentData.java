package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "StudentData")
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentDataId")
    private int studentDataId;

    @Column(name = "Batch")
    private String batch;

    @Column (name = "StudentId")
    private int StudentId;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    @Column(name = "Branch")
    private String branch;



}