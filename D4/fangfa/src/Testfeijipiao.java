import java.util.Scanner;

public class Testfeijipiao {
    public static void main(String[] args) {
        feijipiao();
    }

    public static double feijipiao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("原价：");
        double jiage = scanner.nextInt();
        System.out.println("月份：");
        int yuefen = scanner.nextInt();
        System.out.println("请输入座位：经济舱输入0，头等舱输入1");
        int cangwei = scanner.nextInt();
        if (yuefen >= 5 && yuefen <= 10) {
            System.out.println("目前处于旺季，头等舱9折，经济舱8.5折");
            if (cangwei == 0) {
                jiage = jiage * 0.85;
            } else if (cangwei == 1) {
                jiage = jiage * 0.9;
            }
        } else if ((yuefen < 5 && yuefen >= 1 || yuefen >= 11 && yuefen <= 12)) {
            System.out.println("目前处于淡季，头等舱7折，经济舱6折");
            if (cangwei == 0)
                jiage = jiage * 0.6;
            else {
                if (cangwei == 1) {
                    jiage = jiage * 0.7;
                }
            }
        } else {
            System.out.println("输入数据有误");
        }
        System.out.println(jiage);
        return jiage;
    }
}
