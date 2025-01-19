package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private JobService jobService;
    @GetMapping({"/","home"})
    public String home() {
        return "home";
    }
    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }
    @GetMapping
    public String viewJobs(Model model) {
        List<JobPost> jobs = jobService.findalljobs();
        model.addAttribute("jobPosts", jobs);

        return "viewalljobs";
    }
}
