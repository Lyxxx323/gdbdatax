package com.gdbdatax.gdbdatax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GdbdataxApplication {

    @GetMapping("demo")
    public String ert(){
        return "234";
    }


    public static void main(String[] args) {
        SpringApplication.run(GdbdataxApplication.class, args);
    }

}
