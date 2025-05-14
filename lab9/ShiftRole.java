import java.io.Serializable;

public class ShiftRole implements Serializable {
    private String position;

    public ShiftRole(String position) {
        this.position = position;
    }

    public String toString() {
        return position;
    }
}
