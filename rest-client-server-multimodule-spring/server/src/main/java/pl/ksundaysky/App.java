package pl.ksundaysky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author krzysztof.niedzielski
 */

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}

@RestController
class Controller{

    @GetMapping("/test")
    String getTest(){
        return "test";
    }
}
