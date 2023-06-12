public class Student {
    private String xuehao;
    private  String name;
    private  String age;
    private  String banji;

public Student(){
}
public Student( String xuehao,String name,String age,String banji){
    this.xuehao=xuehao;
    this.name=name;
    this.age=age;
    this.banji=banji;
}

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    @Override
    public String toString() {
        return "Student{" +
                "xuehao='" + xuehao + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", banji='" + banji + '\'' +
                '}';
    }
}

