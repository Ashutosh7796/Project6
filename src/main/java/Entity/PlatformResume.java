package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "PlatformResume")
public class PlatformResume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlatformResume")
    private int platformResumeId;

    @Column(name = "Address")
    private String address;

    @Column(name = "HighstLevelOfEud")
    private String highestLevelOfEducation;

    @Column(name = "CollageName")
    private String collegeName;

    @Column(name = "UniversityName")
    private String universityName;

    @Column(name = "Percentages")
    private String percentages;

    @Column(name = "ExperienceType")
    private String experienceType;

    @Column(name = "Experience")
    private String experience;

    @Column(name = "LastCompany")
    private String lastCompany;

    @Column(name = "LastCompanyDesignation")
    private String lastCompanyDesignation;

    @JoinColumn(name = "UserId")
    private User user;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "LastCompanyJoingDate")
    private String lastCompanyJoiningDate;

    @Column(name = "LastDateOrCurrentlyWorking")
    private String lastDateOrCurrentlyWorking;

    @Column(name = "LastCompanyDescription1")
    private String lastCompanyDescription1;

    @Column(name = "LastCompanyDescription2")
    private String lastCompanyDescription2;

    // Getters and setters
}