package com.code.practice.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/api")
@RestController
public class MainCtrl {

    @GetMapping(value = "/")
    public String baseResponse(){
        return "THIS IS A SAMPLE RESPONSE.";
    }
//
//    echo "# practice" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/ramanbhumireddy/practice.git
//    git push -u origin main


}
