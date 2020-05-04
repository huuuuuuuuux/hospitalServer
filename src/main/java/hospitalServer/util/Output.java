package hospitalServer.util;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.util
 **/
public class Output {
    private  static final Logger LOG = Logger.getLogger(Output.class);

    public static void output(String tag, HttpServletResponse response, Object object) throws IOException {
        if(object != null) {
            String jsonObject = JSON.toJSONString(object);
            ServletOutputStream output = response.getOutputStream();
            //将字符转换成字节数组，并且指定UTF-8编码
            byte[] dataByte = jsonObject.getBytes("UTF-8");
            //输出
            output.write(dataByte);
            LOG.info(tag + "成功" + object);
        }
        else {
            LOG.info(tag + "失败");
        }
    }
}
