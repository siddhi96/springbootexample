import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


/*@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}*/


@RestController
@EnableAutoConfiguration
public class example {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int adding(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + n2;
    }

/*
    public static void main(String[] args) throws Exception {
        SpringApplication.run(example.class, args);
    }
}

/*
@RestController
@RequestMapping("/")
public class example {
    @RequestMapping(value = "/id")
    String getIdByValue(@RequestParam("id") String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL with value element";
    }
   /* @RequestMapping(value = "/personId")
    String getId(@RequestParam String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL without value element";
    }*/



    public static void main(String[] args) throws Exception {
        SpringApplication.run(example.class, args);
    }
}