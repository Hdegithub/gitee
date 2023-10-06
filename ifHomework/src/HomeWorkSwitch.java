
import java.util.Scanner;

public class HomeWorkSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入整数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入运算方式（1：加，2：减，3：乘。4：除）");
        int type = scanner.nextInt();
        switch (type) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
        }
    }
}

