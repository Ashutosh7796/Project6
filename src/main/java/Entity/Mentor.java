package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Mentor")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MentorId")
    private int mentorId;

    @Column(name = "SpecialityOfMentor")
    private String specialityOfMentor;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "Subject")
    private String subject;

    @Column(name = "MentorInfo")
    private String mentorInfo;

    @Column(name = "Achievements")
    private String achievements;

    @Column(name = "SocalMediaLinkF")
    private String socialMediaLinkF;

    @Column(name = "AboutAs")
    private String aboutAs;

    @Column(name = "SocialMediaLinkL")
    private String socialMediaLinkL;

    @Column(name = "SocialMediaLinkF1")
    private String socialMediaLinkF1;

    @Column(name = "SocialMediaLinkInsta")
    private String socialMediaLinkInsta;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    @Column(name = "Cost")
    private String cost;


}