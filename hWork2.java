import java.util.Scanner;

public class hWork2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type a: ");
        int a = Integer.parseInt(read.nextLine());
        System.out.print("Type b: ");
        int b = Integer.parseInt(read.nextLine());
        int sum = a + b;
        int dif = a - b;
        int mult = a * b;
        double div = a / b;
        double perc = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("'Difference': " + dif);
        System.out.println("'Multiplication': " + mult);
        System.out.println("'Division': " + div);
        System.out.println("'Percent': " + perc);
    }
}
