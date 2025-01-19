package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;
    public void addJob(JobPost jobPost){
        jobRepo.addjob(jobPost);
    }
    public List<JobPost> findalljobs(){
        return jobRepo.findalljobs();
    }
}
