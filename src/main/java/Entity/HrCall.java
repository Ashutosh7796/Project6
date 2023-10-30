package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "HrCall")
public class HrCall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HrCall")
    private int hrCallId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Time")
    private java.sql.Time time;

    @Column(name = "Position")
    private String position;

    @Column(name = "Status")
    private String status;

    @Column(name = "Respond")
    private String respond;

    @ManyToOne
    @JoinColumn(name = "Hr_HrId")
    private Hr hr;


}