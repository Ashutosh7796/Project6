package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "LiveProject")
public class LiveProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LiveProject")
    private int liveProjectId;

    @Column(name = "Domain")
    private String domain;

    @Column(name = "InternshipType")
    private String internshipType;

    @Column(name = "InternshipDuration")
    private String internshipDuration;

    @Column(name = "PointOfContact")
    private String pointOfContact;

    @Column(name = "PointOfContact01")
    private String pointOfContact01;

    @Column(name = "Company")
    private String company;

    @Column(name = "Location")
    private String location;

    @Column(name = "JobDescription")
    private String jobDescription;

    @Column(name = "KeySkill")
    private String keySkill;


}