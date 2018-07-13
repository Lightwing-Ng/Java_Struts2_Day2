package com.lightwing.struts2.demo2;

import com.lightwing.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据封装的方式二：属性驱动-在页面中提供表达式的方式
 *
 * @author jt
 */
public class UserAction2 extends ActionSupport {
    // 提供一个 User 对象:
    private User user;

    // 提供 user 的 set 和 get 方法：一定要提供 get 方法。
    // 因为拦截器完成数据封装，需要创建 User 对象。通过 get 方法可以获得同一个对象，将数据封装到同一个对象中。
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() {
        System.out.println(user);
        return NONE;
    }
}
