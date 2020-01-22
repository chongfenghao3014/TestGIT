package cn.arua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControllerApp extends SpringBootServletInitializer {
    @RequestMapping("/hello")
    public String hello(){
        return "hello ... world -v.0.1";
    }

    public static void main(String[] args) {
        SpringApplication.run(ControllerApp.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ControllerApp.class);
    }

}
