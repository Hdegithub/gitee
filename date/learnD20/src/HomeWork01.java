import java.time.Duration;
import java.time.LocalDateTime;

public class HomeWork01 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(1970, 10, 1, 0, 0, 0);
        LocalDateTime today = LocalDateTime.now();
        Duration duration = Duration.between(time, today);
        long days = duration.toDays();
        long min = duration.toSeconds();
        System.out.println("1970.10.1到现在已经过了" + days + "天");
        System.out.println("过了" + min + "秒");
    }
}
