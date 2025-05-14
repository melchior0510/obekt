public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("==== Баристагийн танилцуулга ====");
        Barista munkhOrgil = new Barista("Munkh-Orgil", 20, "B242270130", "2 years at Coffee Beans Ulaanbaatar - mastered espresso & latte art");
        munkhOrgil.introduce();
        munkhOrgil.makeCoffee();
        munkhOrgil.breathe();

        System.out.println("\n==== Аяганы мэдээлэл ====");
        CoffeeMug mug = new CoffeeMug();
        mug.info();
    }
}
