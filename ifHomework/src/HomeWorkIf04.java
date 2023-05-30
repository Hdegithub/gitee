import java.util.Scanner;

public class HomeWorkIf04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否有会员,有：1，无：0");
        int isvip = scanner.nextInt();
        if (isvip == 1) {
            System.out.println("请输入消费金额：");
        }
        double costmoney = scanner.nextDouble();
        if (costmoney > 0 && costmoney < 200) {
            System.out.println("消费金额：" + costmoney * 0.8);
        } else if (costmoney >= 200) {
            System.out.println("消费金额：" + costmoney * 0.75);
        } else if (isvip == 0) {
            System.out.println("请输入消费金额：");
        }
        double costmoney2 = scanner.nextDouble();
        if (costmoney2 > 0 && costmoney2 < 100) {
            System.out.println("您的消费金额：" + costmoney2);
        } else if (costmoney2 >= 100) {
            System.out.println("消费金额：" + costmoney2 * 0.9);
        } else {
            System.out.println("消费金额错误");
        }
    }
}
