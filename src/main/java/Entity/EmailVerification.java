package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "EmailVerification")
public class EmailVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Email")
    private String email;

    @Column(name = "otp")
    private String otp;

    @Column(name = "creation_time")
    private Date creationTime;

    @Column(name = "userotp")
    private String userOtp;

    @Column(name = "status")
    private String status;

}