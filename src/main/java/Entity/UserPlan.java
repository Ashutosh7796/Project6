package Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "userPlan")
public class UserPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userPlanId")
    private int userPlanId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "PlanId")
    private int planId;

    @Column(name = "PayId")
    private int payId;

    @Column(name = "status")
    private String status;


}