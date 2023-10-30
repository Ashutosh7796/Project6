package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "Banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BannerId")
    private int bannerId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Status")
    private String status;

    @Column(name = "title")
    private String title;


}