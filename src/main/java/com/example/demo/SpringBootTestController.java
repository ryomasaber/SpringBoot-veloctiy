package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Created by Saber on 2018/2/24 下午1:13
 */
@Controller
@RequestMapping("/")
public class SpringBootTestController {

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }


    /**
     * ajax test
     *
     * @param request
     * @return
     */
    @RequestMapping("/ajax")
    @ResponseBody
    public String ajaxTest(HttpServletRequest request) {
        return "ajax 测试成功~";
    }

    /**
     * 页面测试
     *
     * @param map
     * @return
     */
    @RequestMapping("/welcome")
    public String viewTest(Map<String, String> map) {
        map.put("a", "SpringBoot1.5.10+velocity 页面测试1");
        return "welcome";
    }

    /**
     * 页面测试2
     *
     * @return
     */
    @RequestMapping("/welcome2")
    public ModelAndView viewTest2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("a", "SpringBoot1.5.10+velocity 页面测试2");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }


    /**
     * 页面测试3
     *
     * @return
     */
    @RequestMapping("/welcome3")
    public ModelAndView viewTest3() {
        ModelMap map = new ModelMap();
        map.put("a", "SpringBoot1.5.10+velocity 页面测试3");
        return new ModelAndView("view/welcome", map);
    }


}
