/**
 * Author:   shitian
 * Date:     2018/7/11 11:36
 * Description:
 */
package com.rocky.controller;

import com.rocky.service.DemoViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    DemoViewService demoViewService;

    @RequestMapping("/list")
    public String testThymeleaf(Map<String, Object> map) {
        map.put("msg", "Hello Thymeleaf");

        map.put("userList", demoViewService.getPersonList());

        return "customer/customerList";
    }

    @RequestMapping("/freemaker")
    public String testFreemaker(Map<String, Object> map) {
        map.put("msg", "Hello freemarker!");
        return "sidebar";
    }

    @RequestMapping("/index")
    public String index() {
        return "sidebar";
    }
}
