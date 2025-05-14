import java.io.Serializable;

public class Coffee implements Serializable {
    private String name;
    private String imageName;
    private int soldPerDay;

    public Coffee(String name, String imageName, int soldPerDay) {
        this.name = name;
        this.imageName = imageName;
        this.soldPerDay = soldPerDay;
    }

    public String toString() {
        return "Кофены нэр: " + name +
               "\nЗургийн нэр: " + imageName +
               "\nӨдөрт зарагдсан тоо: " + soldPerDay;
    }
}
