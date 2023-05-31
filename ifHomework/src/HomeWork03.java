import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请存入金额:");
        int money = scanner.nextInt();
        if (money < 1000) {
            System.out.println("存款金额需大于1000");
        }
        System.out.println("期限：");
        int year = scanner.nextInt();
        double oneyear = money + money * 0.0225;
        double twoyear = money + money * 0.027 * 2;
        double threeyear = money + money * 0.0325 * 3;
        double fiveyear = money + money * 0.036 * 5;
        if (year == 1) {
            System.out.println("本息：" + oneyear);
        } else if (year == 2) {
            System.out.println("本息：" + twoyear);
        } else if (year == 3) {
            System.out.println("本息：" + threeyear);
        } else if (year == 5) {
            System.out.println("本息：" + fiveyear);
        }else {
            System.out.println("期限错误");
        }
    }
}
