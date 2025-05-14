import java.io.*;

public class FileOut {
    public static void main(String[] args) throws IOException {
        // Зурагны замыг харьцангуй байдлаар бичиж өгсөн
        Coffee c1 = new Coffee("Espresso", "images/espresso.jpg", 25);
        Coffee c2 = new Coffee("Latte", "images/latte.jpg", 40);

        try {
            // Файл руу бичих
            FileOutputStream f = new FileOutputStream(new File("coffeeData.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(c1);
            o.writeObject(c2);
            o.close();

            // Файлаас унших
            FileInputStream fIn = new FileInputStream(new File("coffeeData.txt"));
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            c1 = (Coffee) oIn.readObject();
            c2 = (Coffee) oIn.readObject();
            oIn.close();

            // Үр дүнг хэвлэх
            System.out.println(c1);
            System.out.println("------------------");
            System.out.println(c2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл олдсонгүй.");
        } catch (IOException e2) {
            System.out.println("Файлтай ажиллах үед алдаа гарлаа.");
        } catch (ClassNotFoundException e3) {
            System.out.println("Класс олдсонгүй.");
        }
    }
}
