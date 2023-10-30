package Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ITTrainingBooking")
public class ITTrainingBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITTrainingBooking")
    private int ITTrainingBookingId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "Status")
    private String status;

    @Column(name = "Date")

    private Date date;

    @ManyToOne
    @JoinColumn(name = "ItTraining_ItTrainingId")
    private ITTraining itTraining;

}