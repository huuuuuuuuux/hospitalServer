package hospitalServer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hospitalServer.bean.User;
import hospitalServer.service.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/
@Controller
@RequestMapping("/uus")
public class UserController {
    @Autowired
    private UserService uService;

    private  static final Logger LOG = Logger.getLogger(UserController.class);
    @RequestMapping("/get.do")
    public void showUser(){
        List<User> u = uService.showUser();
        System.out.println(u.toString());
//        LOG.info("....==>"+u[0].getName());
    }
}