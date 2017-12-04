package com.jacky.sell.dao;

import com.jacky.sell.dataobj.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jacky on 2017/12/2.
 */
public interface ProductRepository extends JpaRepository<ProductCategory, Integer> {
}
