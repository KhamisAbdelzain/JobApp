package com.telusko.JobApp.repo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.JobApp.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {


 


}
