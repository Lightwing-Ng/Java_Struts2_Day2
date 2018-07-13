package com.lightwing.struts2.demo1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import java.util.Map;
import java.util.Arrays;

/**
 * 访问Servlet的API方式一：完全解耦合的方式
 *
 * @author Lightwing Ng
 */
public class RequestDemo2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        // 1. 接收参数：
        // 利用 Struts2 中的对象 ActionContext 对象
        ActionContext context = ActionContext.getContext();

        // 调用 ActionContext 中的方法。
        // 类似于 Map<String,String[]> request.getParameterMap();
        Map<String, Object> map = context.getParameters();
        for (String key : map.keySet()) {
            String[] values = (String[]) map.get(key);
            System.out.println(key + " " + Arrays.toString(values));
        }

        // 2. 向域对象中存入数据
        context.put("reqName", "reqValue");
        context.getSession().put("sessName", "sessValue");
        context.getApplication().put("appName", "appValue");

        return SUCCESS;
    }
}
