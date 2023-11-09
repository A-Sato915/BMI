import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double x = sc.nextDouble();
        double y = x / (n * n);
        System.out.println(String.format("%.2f", y));
    }
}