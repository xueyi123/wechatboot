/**
 * ---------------------------------------------------------------------------
 * 类名称   ：TestController
 * 类描述   ：
 * 创建人   ： xue.yi
 * 创建时间： 2016/8/16 10:37
 * 版权拥有：银信网银科技
 * ---------------------------------------------------------------------------
 */
package com.iih5.springboot.demo.controller;

import com.iih5.springboot.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
@Autowired
TestService testService;

    @RequestMapping("/hello")
    ModelAndView home(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("-----------------");
        //testService.test();
        Map map = new HashMap<String,Object>();
       // map.put("name",req.getParameter("id"));
      //  DB.M("t_hello").set("name","hello").save();
      //  DB.M("t_world").set("name","world").save();
        map.put("name","King!");
        return  new ModelAndView("hell",map);
    }

}
