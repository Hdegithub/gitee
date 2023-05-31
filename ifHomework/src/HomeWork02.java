import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入整数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入整数：");
        int num3 = scanner.nextInt();
        int tem = num1 < num2 ? num1 : num2;
        if (num3 < tem) {
            System.out.println("最小值为：" + num3);
        } else {
            System.out.println("最小值为：" + tem);
        }


    }
}
