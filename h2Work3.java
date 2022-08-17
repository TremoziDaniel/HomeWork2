import java.util.Scanner;

public class h2Work3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double pi = 3.14;
        double cal = 40;

        double r1 = read.nextDouble() / 2;
        double r2 = read.nextDouble() / 2;

        double S1 = pi * r1 * r1;
        double S2 = pi * r2 * r2;
        double calDif = (S1 - S2) * cal;
        if(calDif < 0) {
            calDif *= -1;
        }

        System.out.println("Calorie difference: " + calDif);
    }
}
