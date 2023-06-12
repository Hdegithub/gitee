import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentslist = new ArrayList<>();
        System.out.println("size:" + studentslist.size());

        Student xuesheng = new Student("222", "张无忌", "19", "武当一班");
        Student xuesheng2 = new Student("333", "张翠山", "40", "武当十班");
        Student xuesheng3 = new Student("444", "苗翠花", "50", "峨眉一班");
        Student xuesheng4 = new Student("555", "张三丰", "60", "太极一班");
        Student xuesheng5 = new Student("666", "刘德华", "70", "香港三班");
        studentslist.add(xuesheng);
        studentslist.add(xuesheng2);
        studentslist.add(xuesheng3);
        studentslist.add(xuesheng4);
        studentslist.add(xuesheng5);
        System.out.println(studentslist);

        while (true) {
            System.out.println("请输入名字：");
            String stuNo = scanner.next();
            boolean iffind=false;
            for (int i = 0; i < studentslist.size(); i++) {
                Student student = studentslist.get(i);
                /**
                 * 从当前学生学号中查找输入的字符串stuNo
                 */
                String string = student.getName();
                if (string.contains(stuNo)) {
                    System.out.println("找到了含有" + stuNo + "的学生：" + student.toString());
                }else {
                    System.out.println("未找到含该名字的学生");
                }
            }
        }
    }
}
