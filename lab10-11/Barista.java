public class Barista extends Student {
    public String coffeeShopExperience;

    public Barista(String name, int age, String code, String experience) {
        super(name, age, code);
        this.coffeeShopExperience = experience;
    }

    // Constructor Overload
    public Barista(String name, int age) {
        this(name, age, "N/A", "No experience yet");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I have experience working in a coffee shop: " + this.coffeeShopExperience);
    }

    public void makeCoffee() {
        System.out.println("Making coffee professionally...");
    }
}

