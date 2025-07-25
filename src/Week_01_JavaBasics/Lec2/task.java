package Week_01_JavaBasics.Lec2;
import java.util.*;

public class task {
    public static void main(String[] args) {
        String name = "Pahal";
        int age = 21;
        double price = 22.10;

        System.out.println(name);
        System.out.println(age);
        System.out.println(price);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = (3.16 * radius * radius);
        System.out.print("area of circle is: " + area);

        System.out.println("table of 2");
        System.out.println("2 x 1 = 2");
        System.out.println("2 x 2 = 4");
        System.out.println("2 x 3 = 6");
        System.out.println("2 x 4 = 8");
        System.out.println("2 x 5 = 10");
        System.out.println("2 x 6 = 12");
        System.out.println("2 x 7 = 14");
        System.out.println("2 x 8 = 16");
        System.out.println("2 x 8 = 16");
        System.out.println("2 x 10 = 20");
    }
}
