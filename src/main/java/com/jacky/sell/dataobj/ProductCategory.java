package com.jacky.sell.dataobj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jacky on 2017/12/2.
 */
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer category_Id;


    private String categoryName;

    private Integer category_type;

    public Integer getCategory_Id() {
        return category_Id;
    }

    public void setCategory_Id(Integer category_Id) {
        this.category_Id = category_Id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategory_type() {
        return category_type;
    }

    public void setCategory_type(Integer category_type) {
        this.category_type = category_type;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "category_Id=" + category_Id +
                ", categoryName='" + categoryName + '\'' +
                ", category_type=" + category_type +
                '}';
    }
}
