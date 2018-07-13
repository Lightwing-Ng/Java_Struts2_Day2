package com.lightwing.struts2.demo3;

import com.lightwing.struts2.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * 复杂数据类型的封装：封装到Map集合
 *
 * @author Lightwing Ng
 */
public class ProductAction2 extends ActionSupport {
    private Map<String, Product> map;

    public Map<String, Product> getMap() {
        return map;
    }

    public void setMap(Map<String, Product> map) {
        this.map = map;
    }

    @Override
    public String execute() {
        for (String key : map.keySet()) {
            Product product = map.get(key);
            System.out.println(key + " " + product);
        }
        return NONE;
    }
}
