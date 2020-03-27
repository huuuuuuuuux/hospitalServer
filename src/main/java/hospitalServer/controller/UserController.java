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
 * @author chenjw
 * @version v1.0.0
 * @description
 * @date Created in 2018/8/3 10:17
 */
@Controller
@RequestMapping("/uus")
public class UserController {
    @Autowired
    private UserService uService;

    private  static final Logger LOG = Logger.getLogger(UserController.class);
    @RequestMapping("/get.do")
    public ModelAndView showUser(){
        System.out.println("uuuuuu");
//        User u = uService.showUser("1");
        List<User> u = uService.showUser();
        ModelAndView mv = new ModelAndView();
        mv.addObject("users",u);
        mv.setViewName("itemDetail");

        System.out.println(u.toString());
//        LOG.info("....==>"+u[0].getName());

        return mv;

    }
}