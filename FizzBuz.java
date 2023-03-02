package FizzBuzz;
import java.util.Scanner;

public class FizzBuz {
    public static void main(String[] args) throws Exception {
        System.out.println("input an integer variable");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("input an integer variable");
        int b = sc.nextInt();
        System.out.println("input an integer variable");
        int c = sc.nextInt();
        System.out.println("input an integer variable");
        int d = sc.nextInt();
        fizzBuzz(a, b, c, d);

    }

    public static void fizzBuzz(int a, int b, int c, int d) {

        for (int index = a; index <= b; index++) {
            if (index % c == 0 && index % d != 0) {
                System.out.println("Fizz");
            } else if (index % d == 0 && index % c != 0) {
                System.out.println("Buzz");
            } else if (index % c == 0 && index % d == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(index);
            }

        }

    }
}
