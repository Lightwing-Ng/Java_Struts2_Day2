package com.lightwing.struts2.demo3;

import com.lightwing.struts2.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * 复杂类型的数据封装：封装到List集合
 *
 * @author Lightwing Ng
 */
public class ProductAction1 extends ActionSupport {
    private List<Product> products;

    // 提供集合的set方法:
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String execute() throws Exception {
        for (Product product : products) {
            System.out.println(product);
        }
        return NONE;
    }
}
