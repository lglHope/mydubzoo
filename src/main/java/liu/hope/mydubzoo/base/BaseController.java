package liu.hope.mydubzoo.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 殷帅
 * @version 1.0
 * @Description: 控制器基类
 * @date 2016年7月16日
 */
public class BaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 重定向
     */
    protected static String REDIRECT = "redirect:";

}