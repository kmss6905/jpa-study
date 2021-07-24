import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "USER_IDX")
    private int userId;


    @Column(name = "LOGIN_ID")
    private String loginId;

    @Column(name="IMEI")
    private String imei;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE")
    private String ci;

    @Column(name = "LEVEL")
    private String level;

    @Column(name = "IS_MANAGEMENT")
    private boolean isManagement;


    public int getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginId='" + loginId + '\'' +
                ", imei='" + imei + '\'' +
                ", name='" + name + '\'' +
                ", ci='" + ci + '\'' +
                ", level='" + level + '\'' +
                ", isManagement=" + isManagement +
                '}';
    }
}
