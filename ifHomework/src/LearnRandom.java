import java.util.Random;
import java.util.Scanner;

public class LearnRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("请猜数字：");
            int num2 = scanner.nextInt();
            if (num > num2) {
                System.out.println("猜小了");
            } else if (num < num2) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
