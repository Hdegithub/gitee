package com.test.stu.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学生信息
 * @TableName stu_table
 */
@Data
public class StuTable implements Serializable {
    /**
     * 学生编号
     */
    private Integer id;

    /**
     * 学生状态
     */
    private Integer stuId;

    /**
     * 学生名
     */
    private String stuName;

    /**
     * 性别
     */
    private String stuGender;

    /**
     * 出生日期
     */
    private Date stuDay;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StuTable other = (StuTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStuId() == null ? other.getStuId() == null : this.getStuId().equals(other.getStuId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getStuGender() == null ? other.getStuGender() == null : this.getStuGender().equals(other.getStuGender()))
            && (this.getStuDay() == null ? other.getStuDay() == null : this.getStuDay().equals(other.getStuDay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStuId() == null) ? 0 : getStuId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getStuGender() == null) ? 0 : getStuGender().hashCode());
        result = prime * result + ((getStuDay() == null) ? 0 : getStuDay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuId=").append(stuId);
        sb.append(", stuName=").append(stuName);
        sb.append(", stuGender=").append(stuGender);
        sb.append(", stuDay=").append(stuDay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}