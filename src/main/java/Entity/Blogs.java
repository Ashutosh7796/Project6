package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Blogs")
public class Blogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BlogsId")
    private int blogId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "blogContent")
    private String blogContent;

    @Column(name = "blogContent1")
    private String blogContent1;

    @Column(name = "blogContent2")
    private String blogContent2;


}