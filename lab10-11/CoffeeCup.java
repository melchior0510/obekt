public class CoffeeCup extends Cup {
    protected boolean hasLid = false;

    @Override
    public void info() {
        System.out.println("Coffee cup with volume: " + volume + "ml. Lid: " + hasLid);
    }
}
