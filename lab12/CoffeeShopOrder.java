public class CoffeeShopOrder extends BaristaFrame {

    private String baristaName;

    public CoffeeShopOrder(String name) {
        super("Coffee Shop Order");
        this.baristaName = name;
    }

    public static void main(String[] args) {
        CoffeeShopOrder app = new CoffeeShopOrder("Munkh-Orgil");
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        Object source = e.getSource();

        if (source == orderBtn) {
            String coffee = coffeeField.getText().trim();
            if (!coffee.isEmpty()) {
                statusLabel.setText(baristaName + " is preparing: " + coffee);
            } else {
                statusLabel.setText("Please enter a coffee type!");
            }
        } else if (source == cancelBtn) {
            statusLabel.setText("Order cancelled.");
            coffeeField.setText("");
        }
    }
}
