import java.util.Scanner;

public class WeekHomeWork03 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("评委一：");
        int score = scanner.nextInt();
        scores[0] = score;
        System.out.println("评委二：");
        int score1 = scanner.nextInt();
        scores[1] = score1;
        System.out.println("评委三：");
        int score2 = scanner.nextInt();
        scores[2] = score2;
        System.out.println("评委四：");
        int score3 = scanner.nextInt();
        scores[3] = score3;
        System.out.println("评委五：");
        int score4 = scanner.nextInt();
        scores[4] = score4;
        System.out.println("评委六：");
        int score5 = scanner.nextInt();
        scores[5] = score5;
        int maxnum = scores[0];
        int minnum = scores[0];
        //找最大
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxnum) {
                maxnum = scores[i];
            }
            //找最小
            for (int j = 1; j < scores.length; j++) {
                if (scores[i] < minnum) {
                    minnum = scores[i];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("选手最终成绩为：" + (sum - maxnum - minnum) / 4);
    }
}
