import java.util.Arrays;
import java.util.Random;

public class StrArr {
    public static void main(String[] args) {
        String[] names = {"何", "李", "王", "陈"};
        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
            int name1 = random.nextInt(names.length);
            String emp = names[i];
            names[i] = names[name1];
            names[name1] = emp;
        }
        System.out.println(Arrays.toString(names));
    }
}
