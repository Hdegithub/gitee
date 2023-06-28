package com.learn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    static double allmoney = 0;//部门一的总工资
    static double allmoneytotal = 0;//两个部门的总工资

    public static void main(String[] args) {
        //部门一
        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(new Employee("猪八戒", '男', 30000, 25000, null));
        employeeList1.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        employeeList1.add(new Employee("沙僧", '男', 20000, 20000, null));
        employeeList1.add(new Employee("小白龙", '男', 20000, 25000, null));

        //部门二
        List<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(new Employee("武松", '男', 15000, 9000, null));
        employeeList2.add(new Employee("李逵", '男', 20000, 10000, null));
        employeeList2.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        employeeList2.add(new Employee("潘金莲", '女', 3500, 1000, "被打"));
        employeeList2.add(new Employee("武大郎", '女', 20000, 0, "下毒"));

        Employee employeeTopMoney = employeeList1.stream().max((e1, e2) ->
                Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus())).get();
        System.out.println("部门一收入最高的是" + employeeTopMoney);

        Topperformer topperformer = employeeList1.stream().max((e1, e2) ->
                Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .map(emp -> new Topperformer(emp.getName(), emp.getSalary() + emp.getBonus())).get();
        System.out.println(topperformer);

        //统计平均工资

        employeeList1.stream().sorted((e1, e2) ->
                Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(employeeList1.size() - 2).forEach(e -> {
            System.out.println(e);
            allmoney += (e.getSalary() + e.getBonus());
        });
        double pingjun = allmoney / (employeeList1.size() - 2);
        System.out.println("部门一的平均工资是:" + pingjun);

        //把两个部门数据放一起
        Stream<Employee> s1 = employeeList1.stream();
        Stream<Employee> s2 = employeeList2.stream();
        Stream<Employee> s12 = Stream.concat(s1, s2);

        s12.sorted((e1, e2) ->
                Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(employeeList1.size() + employeeList2.size() - 2)//掐头去尾
                .forEach(e -> {
                    allmoneytotal += (e.getSalary() + e.getSalary());
                });
        BigDecimal allmoneyde = BigDecimal.valueOf(allmoneytotal);
        BigDecimal employeede = BigDecimal.valueOf(employeeList1.size() + employeeList2.size() - 2);
        BigDecimal avgtotal = allmoneyde.divide(employeede, 2, RoundingMode.HALF_UP);
        System.out.println("研发部平均工资：" + avgtotal);
    }
}
