/**
 * Author:   shitian
 * Date:     2018/7/11 9:46
 * Description:
 */
package com.rocky.controller;

import com.rocky.model.confbean.MysqlSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    private MysqlSettings mysqlSettings;

    @RequestMapping("/login")
    String login(HttpServletRequest request){
        return "index-2";
    }
}
