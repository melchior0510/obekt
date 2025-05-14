public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age);
    }

    public final void breathe() {
        System.out.println("Breathing like a human.");
    }
}
