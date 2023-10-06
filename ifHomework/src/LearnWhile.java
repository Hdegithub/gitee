public class LearnWhile {
    public static void main(String[] args) {
        long hight = 8848860l;
        double paper = 0.1;
        double i = 0;
        while (paper < hight) {
            System.out.println(paper = paper * 2);
            i++;
        }
        System.out.println("需折叠：" + i);
    }
}