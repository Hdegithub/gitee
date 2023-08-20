package com.learnjsp.pojo;

public class Type extends Brand {
    // type_id, type_name
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeName='" + typeName + '\'' +
                "brandName:" + this.getBrandName() +
                '}';
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
