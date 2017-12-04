package com.jacky.sell.dao;

import com.jacky.sell.dataobj.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by jacky on 2017/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository repository;

    @Test
    public void findOneText() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

}