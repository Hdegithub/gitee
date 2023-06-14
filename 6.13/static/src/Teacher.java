public class Teacher extends People {
private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public void question(){
        System.out.println("发布问题");
    }
}
