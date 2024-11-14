package com.example.mvc.controller;


import com.example.mvc.model.JobPost;
import com.example.mvc.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    JobService service;

    @RequestMapping({"/","/home"})
    public String Home(){
        return "home";
    }

    @RequestMapping("/viewalljobs")
    public String ViewAllJobs(Model ma){
        ma.addAttribute("jobPosts",service.getAllJobs());
        return "viewAllJobs";
    }

    @RequestMapping("/addjob")
    public String AddJob(){
        return "addJob";
    }

    @PostMapping("/handleForm")
    public String handleFormSubmit(JobPost jobPost, Model model){
        service.addJob(jobPost);
        model.addAttribute("jobPost",jobPost);
        return "success";
    }

}
