package cn.itcast.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该类的作用:
 */
@Controller
public class StartController {
    @RequestMapping("/quick")
    public String quick(){
        return "hello springBoot";
    }
}
