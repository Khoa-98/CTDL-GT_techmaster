import java.rmi.StubNotFoundException;

public class Sosanh2Object {

    public static void main(String[] args) {
        Student s1 = new Student(10, "Jim");
        Student s2 = new Student(10, "Jim");
        System.out.println(s1.equals(s2));
    }
}
