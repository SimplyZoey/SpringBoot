/**
 * Author:   shitian
 * Date:     2018/7/11 9:46
 * Description:
 */
package com.rocky.controller;

import com.alibaba.fastjson.JSONArray;
import com.rocky.model.busibean.CmCustomer;
import com.rocky.model.busibean.SecOperator;
import com.rocky.model.confbean.MysqlSettings;
import com.rocky.service.SecOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/operator")
public class LoginController {

    @Autowired
    private SecOperatorService operatorService;

    /**
     * 登录成功就跳转到客户列表
     * @param request
     * @return
     */
    @PostMapping("/login")
    String login(HttpServletRequest request){
        String result = "redirect:/customer/list";
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        SecOperator operator = operatorService.queryByNameAndPassword(name,password);
        if(operator == null){
            result = "error";
        }
        return result;
    }



    /**
     * 操作员列表界面初始化查询方法
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list() {
        Map<String, Object> key = new HashMap<>();
        key.put("state", 1);
        String result = JSONArray.toJSONString(operatorService.queryList(key));
        return result;
    }

    /**
     * 修改操作员，成功后跳转操作员列表
     *
     * @param operator
     * @return
     */
    @PostMapping("/modify")
    public String modify(@RequestBody SecOperator operator) {
        operatorService.update(operator);
        return "redirect:/operator/list";
    }

    /**
     * 新增操作员，成功后跳转操作员列表
     *
     * @param operator
     * @return
     */
    @PostMapping("/insert")
    public String insert(@RequestBody SecOperator operator) {
        operatorService.insert(operator);
        return "redirect:/operator/list";
    }

    /**
     * 根据主键删除操作员，成功后跳转操作员列表
     *
     * @param request
     * @return
     */
    @PostMapping("/delete")
    public String delete(HttpServletRequest request) {
        String operId = request.getParameter("operId");
        if(!StringUtils.isEmpty(operId)){
            operatorService.deleteById(Integer.parseInt(operId));
        }
        return "redirect:/operator/list";
    }
}
