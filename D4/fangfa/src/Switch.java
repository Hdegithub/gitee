import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("原价：");
        double jiage = scanner.nextInt();
        System.out.println("月份：");
        int yuefen = scanner.nextInt();
        System.out.println("请输入座位：经济舱.头等舱");
        String cangwei = scanner.next();
        double resultprice=feijipiao(jiage, yuefen, cangwei);
        System.out.println("最终价格："+resultprice);
    }
    public static double feijipiao(double jiage, int yuefen, String cangwei) {
        if (yuefen >= 5 && yuefen <= 10) {
            switch (cangwei) {
                case "经济舱":
                    jiage = jiage * 0.9;
                    break;
                case "头等舱":
                    jiage = jiage * 0.85;
                    break;
                default:
                    System.out.println("仓位输入错误");
                    break;
            }
        } else if ((yuefen < 5 && yuefen >= 1 || yuefen >= 11 && yuefen <= 12)) {
            switch (cangwei) {
                case "头等舱":
                    jiage = jiage * 0.7;
                    break;
                case "经济舱":
                    jiage = jiage * 0.6;
                    break;
                default:
                    System.out.println("仓位输入错误");
                    break;
            }
        }else {
            System.out.println("月份输入错误");
        }
        return jiage;
    }
}

