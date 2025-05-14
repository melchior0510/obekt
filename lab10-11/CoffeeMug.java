public class CoffeeMug extends CoffeeCup {
    private String material = "Ceramic";

    @Override
    public void info() {
        super.info();
        System.out.println("Material: " + material);
    }
}
