public class Student extends Person {
    public String code;

    public Student(String name, int age, String code) {
        super(name, age);
        this.code = code;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm also a student. Code: " + code);
    }
}
