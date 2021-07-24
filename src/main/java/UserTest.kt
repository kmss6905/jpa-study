import jakarta.persistence.*

@Entity
@Table(name = "user")
class UserTest(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_IDX")
    val id: Int?,

    @Column(name = "LOGIN_ID")
    val name: String?
){
    constructor() : this(null, "")
}