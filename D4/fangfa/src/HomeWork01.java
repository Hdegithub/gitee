import java.util.Random;

public class HomeWork01 {
    public static void main(String[] args) {

        int[] arr = new int[6];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100);

            arr[i] = num;

            System.out.println(arr[i]);
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("六个随机数的和为：" + sum);
    }
}
