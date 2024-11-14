package com.example.mvc.service;


import com.example.mvc.model.JobPost;
import com.example.mvc.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo repo;

    public List<JobPost> getAllJobs(){
        return repo.allJobs();
    }

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }
}
