package Questions.array_13;

import java.util.*;

public class ArrayC {
    public static void main(String[] args) {
        int marks[] = new int [10];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phys: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
    }
}
