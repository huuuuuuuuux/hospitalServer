package hospitalServer.controller;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hospitalServer.bean.User;
import hospitalServer.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
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
        output(response, user);
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

        output(response, user);
    }

    private void output(HttpServletResponse response, User user) throws IOException {
        if(user != null) {
            String jsonObject = JSON.toJSONString(user);
            ServletOutputStream output = response.getOutputStream();
            //将字符转换成字节数组，并且指定UTF-8编码
            byte[] dataByte = jsonObject.getBytes("UTF-8");
            //输出
            output.write(dataByte);
            LOG.info("注册成功" + user);
        }
        else {
            LOG.info("注册失败");
        }
    }
}