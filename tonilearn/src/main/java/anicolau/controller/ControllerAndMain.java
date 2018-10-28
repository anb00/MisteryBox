package anicolau.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class ControllerAndMain {

@RequestMapping("/market")
public String hello() {
    return "<h1><left>This is the Section Activities</left></h1>";


}

    @RequestMapping("/main")
    public String hello2() {
        return "<center><div class=\"container\"><h2>Main</h2></div></center>";
    }
   // public String man;

    @RequestMapping("/more")
    public String hello3() {
        return "<center><a href=\"more\">Main</a></center>" +

                "<left><a href=\"market\">Market</a></left>" +

                "<right><a href=\"market\">Market</a></right>"


                ;
    }
    // public String man;



    public static void main(String[] args){
        SpringApplication.run(ControllerAndMain.class,args);
    }





}
