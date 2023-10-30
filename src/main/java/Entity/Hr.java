package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Hr")
public class Hr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HrId")
    private int hrId;

    @Column(name = "designation")
    private String designation;

    @Column(name = "status")
    private String status;

    @Column(name = "RefNoOfCompany")
    private String refNoOfCompany;

    @ManyToOne
    @JoinColumn(name = "Company_CompanyId")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    // Getters and setters
}