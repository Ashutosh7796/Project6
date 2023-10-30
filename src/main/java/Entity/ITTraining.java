package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "ITTraining")
public class ITTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITTrainingId")
    private int ITTrainingId;

    @Column(name = "Domaimn")
    private String domain;

    @Column(name = "Mode")
    private String mode;

    @Column(name = "mentor")
    private String mentor;

    @Column(name = "Cost")
    private String cost;

    @Column(name = "Topic")
    private String topic;

    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "EndDate")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "Duration")
    private String duration;

}