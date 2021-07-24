import jakarta.persistence.*

@Entity
@Table(name= "host_gosiwon_apply")
class HostGosiwonApply (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GOSIWON_APPLY_IDX")
    val id: Int? = 0,

    @ManyToOne
    @JoinColumn(name = "USER_IDX")
    var user: UserTest? = null,

    @Column(name = "IS_APPROVED")
    var isApproved: Boolean? = false
)