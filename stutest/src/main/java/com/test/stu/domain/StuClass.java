package com.test.stu.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学生班级表
 * @TableName stu_class
 */
@Data
public class StuClass implements Serializable {
    /**
     * 
     */
    private Integer classId;

    /**
     * 
     */
    private String className;

    /**
     * 
     */
    private Date classStarttime;

    /**
     * 
     */
    private Date classLasttime;

    /**
     * 
     */
    private Integer terchId;

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
        StuClass other = (StuClass) that;
        return (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getClassStarttime() == null ? other.getClassStarttime() == null : this.getClassStarttime().equals(other.getClassStarttime()))
            && (this.getClassLasttime() == null ? other.getClassLasttime() == null : this.getClassLasttime().equals(other.getClassLasttime()))
            && (this.getTerchId() == null ? other.getTerchId() == null : this.getTerchId().equals(other.getTerchId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getClassStarttime() == null) ? 0 : getClassStarttime().hashCode());
        result = prime * result + ((getClassLasttime() == null) ? 0 : getClassLasttime().hashCode());
        result = prime * result + ((getTerchId() == null) ? 0 : getTerchId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classId=").append(classId);
        sb.append(", className=").append(className);
        sb.append(", classStarttime=").append(classStarttime);
        sb.append(", classLasttime=").append(classLasttime);
        sb.append(", terchId=").append(terchId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}