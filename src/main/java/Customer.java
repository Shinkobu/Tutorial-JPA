import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //primary key
    @Column(name = "custID", unique = true)
    private int ID;

    @Column(name = "firstName", nullable = false)
    private String FName;
    @Column(name = "lastName", nullable = false)
    private String LName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }
}
