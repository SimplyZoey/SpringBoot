/**
 * Author:   shitian
 * Date:     2018/7/11 11:36
 * Description:
 */
package com.rocky.controller;

import com.alibaba.fastjson.JSONArray;
import com.rocky.model.busibean.CmCustomer;
import com.rocky.service.CmCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
    private CmCustomerService customerService;

    /**
     * 客户列表界面初始化查询方法
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list() {
        Map<String, Object> key = new HashMap<>();
        key.put("state", 1);
        String result = JSONArray.toJSONString(customerService.queryList(key));
        return result;
    }

    /**
     * 修改客户，成功后跳转客户列表
     *
     * @param customer
     * @return
     */
    @PostMapping("/modify")
    public String modify(@RequestBody CmCustomer customer) {
        customerService.update(customer);
        return "redirect:/customer/list";
    }

    /**
     * 新增客户，成功后跳转客户列表
     *
     * @param customer
     * @return
     */
    @PostMapping("/insert")
    public String insert(@RequestBody CmCustomer customer) {
        customerService.insert(customer);
        return "redirect:/customer/list";
    }

    /**
     * 根据主键删除客户，成功后跳转客户列表
     *
     * @param request
     * @return
     */
    @PostMapping("/delete")
    public String delete(HttpServletRequest request) {
        String custId = request.getParameter("custId");
        if(!StringUtils.isEmpty(custId)){
            customerService.deleteById(Integer.parseInt(custId));
        }
        return "redirect:/customer/list";
    }
}
