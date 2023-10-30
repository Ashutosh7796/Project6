package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "User")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserId;

    @Column(name = "FullName" )
    private String FullName;

    @Column(name = "Email" )
    private String Email;

    @Column(name = "MobileNumber" )
    private String MobileNumber;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Status" )
    private String Status;

    @Column(name = "Date" )
    private LocalDate Date;

    @Column(name = "Ref" )
    private String Ref;

    @Column(name = "Gender")
    private String Gender;
}
