package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "Documents")
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DocumentsId")
    private int documentsId;

    @Column(name = "DocType")
    private String docType;

    @Column(name = "DocLink")
    private String docLink;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

    // Getters and setters
}
