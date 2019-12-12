import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(25.5, "black", "football");
        Ball b2 = new Ball(23.5, "red", "football");
        Ball b3 = new Ball(22.5, "green", "football");

        b3.setColor("green");
        b2.setColor("green");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}