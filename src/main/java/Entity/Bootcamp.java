package Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Bootcamp")
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bootcampId")
    private int bootcampId;

    @Column(name = "bootcampTital")
    private String bootcampTitle;

    @Column(name = "bootcampDetails")
    private String bootcampDetails;

    @Column(name = "Date")
    private Date date;

    @Column(name = "bootcampDate")
    private Date bootcampDate;

    @Column(name = "Time")
    private String time;

    @Column(name = "Status")
    private String status;

    @Column(name = "Location")
    private String location;

    @Column(name = "TagLine")
    private String tagLine;

    @Column(name = "Photo")
    private String photo;

    @Column(name = "Price")
    private String price;

}