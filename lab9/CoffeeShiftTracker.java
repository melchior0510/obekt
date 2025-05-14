import java.io.*;

public class CoffeeShiftTracker {
    public static void main(String[] args) throws IOException {
        //  Ажилчдыг үүсгэх
        Barista b1 = new Barista("Tsolmon", 6, new ShiftRole("Barista"));
        Barista b2 = new Barista("Anuka", 8, new ShiftRole("Manager"));

        //  Файлд бичих
        try {
            FileOutputStream fileOut = new FileOutputStream("coffeelog.coffee");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(b1);
            objectOut.writeObject(b2);
            objectOut.close();

            System.out.println("Ээлжийн мэдээлэл амжилттай хадгалагдлаа.");
        } catch (IOException e) {
            System.out.println("Хадгалах үед алдаа гарлаа: " + e.getMessage());
        }

        // ? Файлаас унших
        System.out.println("\n====  Уншсан ээлжийн мэдээлэл ====");
        try {
            FileInputStream fileIn = new FileInputStream("coffeelog.coffee");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Barista read1 = (Barista) objectIn.readObject();
            Barista read2 = (Barista) objectIn.readObject();
            objectIn.close();

            System.out.println(read1);
            System.out.println(read2);
        } catch (FileNotFoundException e) {
            System.out.println(" Файл олдсонгүй.");
        } catch (IOException e) {
            System.out.println(" Унших үед алдаа гарлаа.");
        } catch (ClassNotFoundException e) {
            System.out.println(" Класс олдсонгүй.");
        }
    }
}
