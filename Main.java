import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("身長を入力してください(メートル表記)");
            double n = sc.nextDouble();
            System.out.println("体重を入力してください");
            double x = sc.nextDouble();
            double y = x / (n * n);
            System.out.println("あなたのBMIは" + String.format("%.2f", y) + "です");
        }
    }
}