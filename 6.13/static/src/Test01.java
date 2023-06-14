public class Test01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(22);
        stu.kebiao();
        stu.show();
        stu.setBanji("五年1班");

        Teacher teacher=new Teacher();
        teacher.setName("王老师");
        teacher.setAge(99);
        teacher.kebiao();
        teacher.question();
        teacher.setDept("语文组");
    }
}
