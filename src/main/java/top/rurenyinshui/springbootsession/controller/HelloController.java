package top.rurenyinshui.springbootsession.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @program: springbootsession
 * @author: LiXin
 * @create: 2019-06-19 14:51
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    Integer port;

    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("user","lixin");
        return String.valueOf(port);
    }
    @GetMapping("/get")
    public String get(HttpSession session){
        return session.getAttribute("user")+":"+port;
    }
}
