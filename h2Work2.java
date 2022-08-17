import java.util.Scanner;

public class h2Work2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Type your r: ");
        int r = Integer.parseInt(read.next());
        double S = pi * r * r;
        System.out.println("S: " + S);
    }
}
