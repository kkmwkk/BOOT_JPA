package com.example.demo.test;


import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {


    // http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get 요청" + "," +  m.getId() + "," + m.getPassword();
    }

    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m){
        return "post 요청" + m.getUsername() + "," + m.getEmail() + "," + m.getId() + "," + m.getPassword();
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }




}
