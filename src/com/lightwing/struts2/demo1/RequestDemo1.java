package com.lightwing.struts2.demo1;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

public class RequestDemo1 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        // 1.接收数据
        // 利用 Struts2 中的对象 ActionContext
        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            String[] values = map.get(key);
            System.out.println(key + " " + Arrays.toString(values));
        }

        // 2. 向对象中保存数据
        request.setAttribute("reqName", "reqValue");
        // 3. 向 application 保存数据
        ServletActionContext.getServletContext().setAttribute("appName", "appValue");
        return SUCCESS;
    }
}
