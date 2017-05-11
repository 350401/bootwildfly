package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("User : " + System.getenv("MYSQL_USER") +" ,Password : "+ System.getenv("MYSQL_DB_URL"));
    }
}
