import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik", 1, 22, "black");
        Dog d2 = new Dog("Sharik", 1);
        Dog d3 = new Dog("Tuzik");
        d3.setAge(2);
        d3.setColor("red");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
