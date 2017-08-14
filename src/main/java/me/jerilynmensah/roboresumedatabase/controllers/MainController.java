package me.jerilynmensah.roboresumedatabase.controllers;


import me.jerilynmensah.roboresumedatabase.models.EmployeeList;
import me.jerilynmensah.roboresumedatabase.models.SearchEmployee;
import me.jerilynmensah.roboresumedatabase.repositories.EmploymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

public class MainController {

    @Autowired
    EmploymentRepo employmentRepo;
    //This is the home page

    @GetMapping("/index")
    public String showIndex(Model model)
    {
        String myMessage = "Welcome to the Invoice App";
        model.addAttribute("message", myMessage);
        return "index";
    }

    @PostMapping("/index")
    public String showIndexPost(@Valid @ModelAttribute("jobEmployee") JobEmployee jobEmployee, BindingResult bindingResult, Model model)
    {

        if(bindingResult.hasErrors());
        {
        model.addAttribute("employeelist",new EmployeeList());
        return "index";
        }
        model.addAttribute("employeeconfirm", true);
        employmentRepo.save(employeeList);

        return "index";
    }


    @GetMapping("/employeelist")
    public String showEmployeeList (Model model)
    {
        Iterable<EmployeeList> EmployeeOne = employmentRepo.findAll();

        Object employeeOne;
        model.addAttribute("employeeone", employeeOne);

        return "employeelist";
    }

    @GetMapping("/employeeconfirm")
    public String showEmployee(Model model)
    {
        model.addAttribute("employeeOne",  employeeOne());
        return "employeeconfirm";
    }
    @PostMapping
    public String showEmployee(@Valid @ModelAttribute("employeeOne") EmployeeOne employeeOne, BindingResult bindingResultresult)
    {
        if(bindingResultresult.hasErrors())
        {
            return "employeeform";
        }
        return "employeeconfirm";
    }


    @PostMapping("/searchList")
    public String showSearchList (@ModelAttribute("searchGuy") SearchEmployee searchGuy, Model model) {

        // test output to console
        System.out.println("The search you entered was: " + searchGuy.getSearchEmployee());

        // now search the db for dishes containing whatever the user just entered in the search form
        // we are using out custom query method we defined in our repository
        List<EmployeeList> someGuy = employmentRepo.findEmployeeOneContaining(searchGuy.getSearchEmployee());

        // more test output to console
        System.out.println("List contains this many items: " + someGuy.size());
        // iterate through someGuy List, and print out the dish title for each one
        for (EmployeeList el: someGuy) {
            System.out.println("First Name: " + someGuy.getFirstName());
            System.out.println("Last Name: " + someGuy.getLastName());
        }

        // add the new List to the model, so it can be displayed in searchList.html

        model.addAttribute("searchEntryResultList", someGuy);

        return "searchList";
    }

}






