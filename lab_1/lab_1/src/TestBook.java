import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Prestuplenie i nakazanie", "Dostoevskiy", 526, "Проза");
        Book b2 = new Book("Унесенные ветром", "кто-то", 289, "Проза");
        Book b3= new Book("Конек гобунек", "Ершов", 1, "Проза");

        b3.setPagesCount(10);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}