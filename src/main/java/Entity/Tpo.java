package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Tpo")
public class Tpo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TpoId")
    private int tpoId;

    @Column(name = "CollageName")
    private String collageName;

    @Column(name = "Address")
    private String address;

    @Column(name = "State")
    private String state;

    @Column(name = "Dist")
    private String dist;

    @Column(name = "City")
    private String city;

    @Column(name = "Pincode")
    private String pincode;

    @Column(name = "Type")
    private String type;

    @Column(name = "Date")
    private Date date;

    @Column(name = "EstablishedDate")
    private Date establishedDate;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

}