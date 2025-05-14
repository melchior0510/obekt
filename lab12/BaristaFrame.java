import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class BaristaFrame extends JFrame implements ActionListener {

    protected JTextField coffeeField;
    protected JLabel statusLabel;
    protected JButton orderBtn, cancelBtn;

    public BaristaFrame(String title) {
        super(title);
        setupUI();
    }

    private void setupUI() {
        setSize(300, 200);
        setLocation(150, 250);
        setLayout(new GridLayout(3, 1));

        // Coffee input
        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter coffee type"));
        coffeeField = new JTextField(15);
        inputPanel.add(coffeeField);

        // Status
        JPanel statusPanel = new JPanel();
        statusPanel.setBorder(BorderFactory.createTitledBorder("Status"));
        statusLabel = new JLabel("No orders yet.");
        statusPanel.add(statusLabel);

        // Buttons
        JPanel buttonPanel = new JPanel();
        orderBtn = new JButton("Order");
        cancelBtn = new JButton("Cancel");

        orderBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

        buttonPanel.add(orderBtn);
        buttonPanel.add(cancelBtn);

        add(inputPanel);
        add(statusPanel);
        add(buttonPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
