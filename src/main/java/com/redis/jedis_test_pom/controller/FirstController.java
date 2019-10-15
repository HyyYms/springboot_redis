package com.redis.jedis_test_pom.controller;

import com.redis.jedis_test_pom.utils.StateParameter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/first")
public class FirstController extends BaseController{
    @RequestMapping("view")
    public String view(HttpServletRequest request) {
        logger.info("进入测试页面");
        return "demoPage/firstPage";
    }

    @RequestMapping(value = "/back",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap back(HttpServletRequest request){
        logger.info("进入json测试页面");
        return getModelMap(StateParameter.SUCCESS,null,"请求成功");
    }
}
