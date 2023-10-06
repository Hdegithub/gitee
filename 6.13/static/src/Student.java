public class Student extends People {
    public void show() {
        System.out.println("听课反馈");
    }

    private String banji;

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

}
