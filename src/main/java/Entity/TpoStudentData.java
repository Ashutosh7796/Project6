package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TpoStudentData")
public class TpoStudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TpoStudentDataId")
    private int tpoStudentDataId;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    @Column(name = "TestName")
    private String testName;

    @Column(name = "TotalMarks")
    private String totalMarks;

    @Column(name = "Marks")
    private String marks;

    @Column(name = "Result")
    private String result;




}