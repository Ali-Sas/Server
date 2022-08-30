package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
public class HomeController {
	LinkedList<Click> list = new LinkedList<>();
 
    @RequestMapping("/click")
    public LinkedList<Click> index() {
    	System.out.print(list);
        return list;
    }
    
    @RequestMapping("/send")
    public void send() {
    	list.addFirst(new Click(1));;
    }
    
    @RequestMapping("/sendd")
    public void sendd() {
    	list.addFirst(new Click(0));;
    }
}
