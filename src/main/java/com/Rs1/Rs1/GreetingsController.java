package com.Rs1.Rs1;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/user")
    public Greeting post(@RequestBody Greeting greeting){
        return greeting;
    }

    @GetMapping("/user/{id}")
    public long getid(@PathVariable(value = "id") long id){
        return id;
    }


   @PutMapping("/post")
   @ResponseBody
    public Greeting put(@RequestParam long id,@RequestParam String content){
        Greeting g1 = new Greeting(1,".");
        g1.setId(id);
        g1.setContent(content);
        return g1;
   }

}
