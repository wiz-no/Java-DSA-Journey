package Week_01_JavaBasics.Lec2;

import java.util.*;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       /* String name = sc.next();
        String name1 = sc.nextLine();
        // sc.nextInt(); nextFloat()
        System.out.println("name: " + name);
        System.out.println("Full name: " + name1);*/

        // take 2 variables a,b and print their sum
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
