package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String Hello(){
        return "Hello, Farhan! You are amazing!";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String HelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First Web Application</title>");
        sb.append("</head>");
        sb.append("<body> Hallo Farhan</body>");
        sb.append("</html>");
        return sb.toString();

    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "hello.jsp";

    }
}
