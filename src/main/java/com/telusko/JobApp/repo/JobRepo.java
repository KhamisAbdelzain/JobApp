package com.telusko.JobApp.repo;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {

    List<JobPost> jobs=new ArrayList<>(Arrays.asList(

    ));
    public List<JobPost>findalljobs(){
        return jobs;
    }
    public void addjob(JobPost job){
        jobs.add(job);
    }
}
