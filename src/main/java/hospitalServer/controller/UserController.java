package hospitalServer.controller;

import com.alibaba.fastjson.JSON;
import hospitalServer.util.Output;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hospitalServer.bean.User;
import hospitalServer.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    private  static final Logger LOG = Logger.getLogger(UserController.class);

    @Autowired
    private UserService uService;

    @RequestMapping("/Login")
    public void Login(HttpServletResponse response,
                         @RequestParam(value="id") String id,
                         @RequestParam(value="pwd") String pwd) throws IOException {
        User user = uService.login(id,pwd);
        Output.output("登录",response, user);
    }

    @RequestMapping("/Register")
    public void Register(HttpServletResponse response,
                         @RequestParam(value="id") String id,
                         @RequestParam(value="pwd") String pwd,
                         @RequestParam(value="name") String name,
                         @RequestParam(value="age") String age,
                         @RequestParam(value="sex") String sex) throws IOException {
        int temp_age = Integer.parseInt(age);
        boolean temp_sex = sex.equals("true") ? true : false;
        User user = new User(id, pwd, name, temp_age, temp_sex);
        uService.register(user);
        Output.output("注册", response, user);
    }

}