import com.atmtest.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ArrayList<Account> accountList = new ArrayList<>();
        initAccounts(accountList);
        System.out.println("======欢迎您进入到ATM系统===============");
        while (true) {
            System.out.println("1、登录账户");
            System.out.println("2、注册账户");
            System.out.println("3、退出");
            System.out.println("请您选择操作：");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    login(accountList, sc);
                    break;
                case 2:
                    kaihu(accountList);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }


    public static void login(ArrayList<Account> accountList, Scanner sc) {
        System.out.println("==================欢迎您进入到登录操作======================");
        boolean isloginok = false;
        while (true) {
            System.out.println("请输入卡号：");
            String card = sc.next();
            System.out.println("请输入密码");
            String cardmima = sc.next();
            for (int i = 0; i < accountList.size(); i++) {
                Account acc = accountList.get(i);
                if (card.equals(acc.getCardid()) && cardmima.equals(acc.getMima())) {
                    isloginok = true;
                    System.out.println("登录成功");
                    shouuser(accountList, sc, acc);
                    return;
                }
            }
            if (!isloginok) {
                System.out.println("卡号或密码错误");
            }
        }
    }

    private static void shouuser(ArrayList<Account> accountList, Scanner sc, Account acc) {
        System.out.println("==================欢迎您进入到操作界面======================");
        System.out.println("1、查询");
        System.out.println("2、存款");
        System.out.println("3、取款");
        System.out.println("4、转账");
        System.out.println("5、修改密码");
        System.out.println("6、退出");
        System.out.println("7、注销账户");
        System.out.println("请您输入操作命令：");
        int command = sc.nextInt();
        switch (command) {
            case 1:
                System.out.println("------您的账户信息------");
                System.out.println("卡号：" + acc.getCardid());
                System.out.println("用户名：" + acc.getName());
                System.out.println("密码：" + acc.getMima());
                System.out.println("余额：" + acc.getMoney());
                System.out.println("提现额度：" + acc.getTixian());
                break;
            case 2:
                cunkuan(acc, sc);
                break;
            case 3:
                qukuan(acc, sc);
                break;
            case 4:
                //转账
                zhuanzhang(sc, acc, accountList);
                break;
            case 5:
                //改密码
                changemima(acc, sc);
                return;
            case 6:
                //返回菜单
                return;
            case 7:

                break;
            default:
                System.out.println("输入错误");
                break;
        }
        shouuser(accountList, sc, acc);
    }

    private static void zhuanzhang(Scanner sc, Account acc, ArrayList<Account> accountList) {
        if (accountList.size() < 2) {
            System.out.println("缺少账户");
            return;
        }
        if (acc.getMoney() == 0) {
            System.out.println("你没钱，转不了");
            return;
        }
        System.out.println("请输入对方账户：");
        String hiscardid = sc.next();
        Account accountbycardid = getAccountbycard(accountList, hiscardid);
        if (accountbycardid == null) {
            System.out.println("没有找到：" + hiscardid + "的卡号");
            return;
        }
        String hisname = accountbycardid.getName();
        String maskname = "*" + hisname.substring(1);
        char firstname = hisname.charAt(0);
        System.out.println("请输入 " + maskname + " 的姓氏：");
        String inputname = sc.next();
        if (hisname.startsWith(inputname)) {
            System.out.println("请输入转账金额：");
            double zhuanzhangjine = sc.nextDouble();
            if (zhuanzhangjine > acc.getMoney()) {
                System.out.println("转账金额不能大于你的余额，你的余额为：" + acc.getMoney());
            } else if (zhuanzhangjine == 0) {
                System.out.println("转账金额不能为0");
            }
            accountbycardid.setMoney(accountbycardid.getMoney()+zhuanzhangjine);
            acc.setMoney(acc.getMoney()-zhuanzhangjine);
            System.out.println("转账完成,你的余额为："+acc.getMoney());
            return;
        }
        else {
            System.out.println("输入错误");
        }
        return;

    }

    private static void changemima(Account acc, Scanner sc) {
        while (true) {
            System.out.println("请输入旧密码：");
            String mima = sc.next();
            if (acc.getMima().equals(mima)){
                System.out.println("新密码为：");
                String newmima=sc.next();
                acc.setMima(newmima);
                return;
            }else {
                System.out.println("您输入的密码错误");
            }
        }
    }

    private static void qukuan(Account acc, Scanner sc) {
        System.out.println(" 当前余额为：" + acc.getMoney());
        while (true) {
            System.out.println("请输入取款金额：");
            double qukuan = sc.nextDouble();
            if (qukuan <= 0) {
                System.out.println("取款金额金额");
            } else if (qukuan > acc.getMoney()) {
                System.out.println("取款金额不能大于存款");
            } else if (qukuan > acc.getTixian()) {
                System.out.println("取款金额不能大于" + acc.getTixian());
            } else {
                double yue = acc.getMoney() - qukuan;
                acc.setMoney(yue);
                System.out.println("当前余额：" + acc.getMoney());
                break;
            }
        }
    }

    private static void cunkuan(Account acc, Scanner sc) {
        System.out.println("请存款");
        while (true) {
            System.out.println("请输入存款金额：");
            double cunkuan = sc.nextDouble();
            if (cunkuan <= 0) {
                System.out.println("存款金额错误");
            } else {
                double yue = acc.getMoney() + cunkuan;
                acc.setMoney(yue);
                System.out.println("存款成功 " + " 当前余额为：" + acc.getMoney());
                break;
            }
        }
    }


    private static void initAccounts(ArrayList<Account> accountList) {
        Account account = new Account();
        account.setCardid("987654321");
        account.setName("何彦祖");
        account.setMima("123456");
        account.setMoney(500);
        account.setTixian(5000);
        accountList.add(account);

        Account account2 = new Account();
        account2.setCardid("666666");
        account2.setName("何冠希");
        account2.setMima("333333");
        account2.setMoney(0);
        account2.setTixian(5000);
        accountList.add(account2);
    }

    private static Account getAccountbycard(ArrayList<Account> accountList, String cardid) {
        for (int i = 0; i < accountList.size(); i++) {
            Account acc = accountList.get(i);
            if (cardid.equals(acc.getCardid())) {
                return acc;
            }
        }
        return null;
    }


    private static void kaihu(ArrayList<Account> accounts) {
        System.out.println("==================欢迎您进入到注册账户操作======================");

    }
}
