import java.io.Serializable;

public class Barista implements Serializable {
    private String name;
    private int hoursWorked;
    private ShiftRole role;

    public Barista(String name, int hoursWorked, ShiftRole role) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.role = role;
    }

    public String toString() {
        return name + " | Ээлж: " + hoursWorked + " цаг | Үүрэг: " + role;
    }
}
