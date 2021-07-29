package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.dataRepos.EmployerRepository;
import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("employers")
public class EmployerController {

    //Controllers Part 1
    //Annotate with Autowired
    @Autowired
    //Add a private field of EmployerRepository type called employerRepository
    private EmployerRepository employerRepository;

    //Controllers Part 2
    //Add an index method that responds at /employers with a list of all employers in the database.
    @GetMapping
    public String displayAllEmployers(Model model) {
        model.addAttribute("title", "All Employers");
        model.addAttribute("employers", employerRepository.findAll());
        return "employers/index";
    }

    @GetMapping("add")
    public String displayAddEmployerForm(Model model) {
        model.addAttribute(new Employer());
        return "employers/add";
    }

    //Controllers Part 3
    //takes care of sending the form back if any of the submitted employer object information is invalid.
    //code to save a valid object and the appropriate method to do so. If statement is half built already.
    @PostMapping("add")
    public String processAddEmployerForm(@ModelAttribute @Valid Employer newEmployer,
                                         Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "employers/add";
        }else {
            employerRepository.save(newEmployer);
            return "redirect:";
        }
    }

    //Controllers Part 4
    //displayViewEmployer will be in charge of rendering a page to view the contents of an individual employer object.
    //It will make use of that employer object’s id field to grab the correct information from employerRepository.
    //optEmployer is currently initialized to null. Replace this using the .findById() method with the right argument
    //to look for the given employer object from the data layer.
    @GetMapping("view/{employerId}")
    public String displayViewEmployer(Model model, @PathVariable int employerId) {

        Optional optEmployer = employerRepository.findById(employerId);
        if (optEmployer.isPresent()) {
            Employer employer = (Employer) optEmployer.get();
            model.addAttribute("employer", employer);
            return "employers/view";
        } else {
            return "redirect:../";
        }
    }
}
