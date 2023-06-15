import com.studytest.Card;

public class NotVipCard extends Card {
    @Override
    public void pay(double money) {
        double costmoney = money * 0.85;
        double lastmoney = getYue() - costmoney;
        System.out.println("当前账户：" + getYue() + "消费：" + costmoney + "余额为：" + lastmoney);
        setYue(lastmoney);
    }
}
