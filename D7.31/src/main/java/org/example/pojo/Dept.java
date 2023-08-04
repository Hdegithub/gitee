package org.example.pojo;

public class Dept extends Emp {
    //dept_id, dept_name

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "EmployeeDept{" +
                "deptName='" + deptName + '\'' +
                "empName:" + this.getName() +
                '}';

    }
}
