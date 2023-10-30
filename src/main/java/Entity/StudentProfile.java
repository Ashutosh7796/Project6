package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "StudentProfile")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private int studentId;

    @Column(name = "ExperienceType")
    private String experienceType;

    @Column(name = "WorkExperience")
    private String workExperience;

    @Column(name = "LastWorkDuration")
    private String lastWorkDuration;

    @Column(name = "LastCompany")
    private String lastCompany;

    @Column(name = "LastSalary")
    private String lastSalary;

    @Column(name = "PreviousDesignation")
    private String previousDesignation;

    @Column(name = "CareerBreak")
    private String careerBreak;

    @Column(name = "HighestLevleOfEud")
    private String highestLevelOfEducation;

    @Column(name = "CurrentLocation")
    private String currentLocation;

    @Column(name = "AvailableToJoin")
    private String availableToJoin;

    @Column(name = "Specialization")
    private String specialization;

    @Column(name = "Course")
    private String course;

    @Column(name = "CourseDuration")
    private String courseDuration;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "shortAboutYourself")
    private String shortAboutYourself;

    @Column(name = "PreferredSalary")
    private String preferredSalary;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    // Getters and setters
}