package com.telusko.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.findAll();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.save(jobPost);
	
	}
	public JobPost getJobPostById(int id) {
		return repo.findById(id).orElse(null);
	}
	public void updateJobPost(JobPost jobPost) {
		repo.save(jobPost);

	}
	public void deleteJobPost(int id) {
		repo.deleteById(id);

	}


	
}
