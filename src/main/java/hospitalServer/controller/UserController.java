package hospitalServer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import hospitalServer.bean.User;
import hospitalServer.service.UserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author: create by XiaoHan
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

    @RequestMapping("/getUser")
    public void showUser(HttpServletResponse response,@RequestParam(value="id") String id) throws IOException {
        User user = uService.getUser(id);

        LOG.info(user);

        String jsonObject = JSON.toJSONString(user);
        //获取输出流
	    ServletOutputStream output = response.getOutputStream();
        //将字符转换成字节数组，并且指定UTF-8编码
        byte[] dataByte = jsonObject.getBytes("UTF-8");
        //输出
        output.write(dataByte);

    }
}