package Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "Job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JobId")
    private int jobId;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "PostName")
    private String postName;

    @Column(name = "JobLocation")
    private String jobLocation;

    @Column(name = "Address")
    private String address;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "JobDescription")
    private String jobDescription;

    @Column(name = "PostDate")
    private String postDate;

    @Column(name = "Salary")
    private String salary;

    @Column(name = "NoOfPost")
    private Integer noOfPost;

    @Column(name = "Logo")
    private String logo;

    @Column(name = "ExperienceLevel")
    private String experienceLevel;

    @Column(name = "JobType")
    private String jobType;

    @Column(name = "Status")
    private String status;

    @Column(name = "Incentives")
    private String incentives;

    @Column(name = "EssentialRequirements")
    private String essentialRequirements;

    @Column(name = "SeatNo")
    private String seatNo;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    // Getters and setters
}
