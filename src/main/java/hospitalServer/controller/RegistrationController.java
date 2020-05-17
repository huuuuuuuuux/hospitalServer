package hospitalServer.controller;

import hospitalServer.bean.Registration;
import hospitalServer.service.RegistrationService;
import hospitalServer.util.Output;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.controller
 **/
@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private  static final Logger LOG = Logger.getLogger(RegistrationController.class);

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping("/newRegister")
    public void newRegister(HttpServletResponse response,
                            @RequestParam(value="userId") String userId,
                            @RequestParam(value="schId") int schId) throws IOException {
        Registration registration = registrationService.doRegistration(userId,schId);
        if(registration == null)
            LOG.info("预约失败，无空位");
        Output.output("预约",response, registration);
    }
}
