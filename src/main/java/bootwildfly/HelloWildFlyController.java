package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("User : " + System.getenv("OPENSHIFT_MYSQL_DB_USERNAME") +" ,Password : "+ System.getenv("OPENSHIFT_MYSQL_DB_URL"));
    }
}
