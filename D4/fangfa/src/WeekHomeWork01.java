import java.util.Random;
import java.util.Scanner;

public class WeekHomeWork01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入账号：");
        int zhanghao=scanner.nextInt();
        System.out.println("请输入密码：");
        int mima=scanner.nextInt();
        String[]string={"a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p",
                "q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "0","1","2","3","4","5","6","7","8","9",};
        Random random=new Random();
        String string1="";
        for (int i = 0; i <5 ; i++) {
            int suoyin=random.nextInt(string.length);
            string1=string1+string[suoyin];
        }
        if (zhanghao!=111||mima!=222){
            System.out.println("账号或密码输入错误");
        }else {
            Scanner scanner1=new Scanner(System.in);
            System.out.println("请输入验证码："+string1);
        }
    }
}
