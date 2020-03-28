package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {


        SpringApplication.run(MyProjectApplication.class, args);
    }

@RequestMapping("/")
@ResponseBody
public String index() {
        return "Doctor who (game of thrones is better): <ul>" +
        "<li><a href='/doctor/1'>Jodie Whittaker</a></li>" +
        "<li><a href='/doctor/2'>David Tennant</a></li>" +
        "<li><a href='/doctor/3'>Matt Smith</a></li>" +
        "<li><a href='/doctor/4'>Bradley Walsh</a></li>" +
        "</ul>";
        }

@RequestMapping("/doctor/{id}")
@ResponseBody
public String hello(@PathVariable int id) {
        String [] actor = {"Christopher Eccleston", "David Tennant", "Matt Smith", "Nabil", "Jodie Whittaker"};
        if (id >= 9 && id <=13) {
            return "number: " + id + " name: " + actor[id - 9];
        }
        else if (id >= 1 && id <=8) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Doctor not found");
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation " + id);
}


    }


