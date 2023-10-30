package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CompanyId")
    private int companyId;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "GestnNo")
    private String gestnNo;

    @Column(name = "CompanyServices")
    private String companyServices;

    @Column(name = "CompanyType")
    private String companyType;

    @Column(name = "CompanyLevel")
    private String companyLevel;

    @Column(name = "Logo")
    private String logo;

    @Column(name = "OfficeAddress")
    private String officeAddress;

    @Column(name = "CompanyLocations")
    private String companyLocations;

    @Column(name = "OneCompanyDoc")
    private String oneCompanyDoc;

    @Column(name = "RefNo")
    private String refNo;

    @Column(name = "Status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    // Getters and setters
}