package uz.takhir.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

//Rest API
@RestController
public class HelloWorldController {

    // /hello-world

    //"Hello World"
    //@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    // Path Parameters
    // /users/{id}/todos/{id}
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean("Hello "+name);
    }
}
