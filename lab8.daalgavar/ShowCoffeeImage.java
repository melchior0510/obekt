import javax.swing.*;
import java.awt.*;

public class ShowCoffeeImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Coffee Image");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Зураг оруулах
        ImageIcon icon = new ImageIcon("images/espresso.jpg");
        JLabel label = new JLabel(icon);
        frame.add(label);

        frame.setVisible(true);
    }
}

