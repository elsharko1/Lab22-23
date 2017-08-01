package com.ritter.controller;

/**
 * Created by Mark on 7/21/2017.
 */

import com.model.UsersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","greeting","Welcome to GC COFFEE");
    }
    @RequestMapping("/page2")
    public String thehtmlform(){

//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFact = cfg.buildSessionFactory();
//
//        Session session = sessionFact.openSession();
//
//        Transaction tx = session.beginTransaction();
//
//        UsersEntity newUser = new UsersEntity();
//
//        newUser.setIdUsers(custID);
//        newUser.setFirstname(custFName);
//        newUser.setLastname(custLName);
//        newUser.setEmail(custEmail);
//        newUser.setPhonenumber(custNum);
//        newUser.setPassword(custPass);
//
//        session.save(newUser);
//        tx.commit();
//        session.close();
//
//        model.addAttribute("newStuff", newCustomer);
        return "thehtmlform";

    }
    @RequestMapping("/page3")
    public String formoutput(Model model, @RequestParam("f_name")String firstName,
                             @RequestParam("l_name")String lastName, @RequestParam("e_add") String emailAddress,
                             @RequestParam("p_num")String phoneNum, @RequestParam("p_word")String password){

        model.addAttribute("userFirstName", firstName);
        model.addAttribute("userLastName", lastName);
        model.addAttribute("userEmailAddress", emailAddress);
        model.addAttribute("userPhoneNumber", phoneNum);
        model.addAttribute("userPassword", password);
        return "formoutput";
    }
}
