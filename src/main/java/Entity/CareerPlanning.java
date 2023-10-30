package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "CareerPlanning")
public class CareerPlanning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CareerPlanning")
    private int careerPlanningId;

    @Column(name = "Domain")
    private String domain;

    @Column(name = "Mode")
    private String mode;

    @Column(name = "Slot")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slot;

    @Column(name = "cost")
    private String cost;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "Status")
    private String status;

}