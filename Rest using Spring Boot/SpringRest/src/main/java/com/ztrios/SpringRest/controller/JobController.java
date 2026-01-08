package com.ztrios.SpringRest.controller;

import com.ztrios.SpringRest.model.JobPost;
import com.ztrios.SpringRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping(path="/jobPosts",produces = "application/xml") //only produces xml format
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobPost/{jobId}")
    public JobPost getJob(@PathVariable("jobId") int jobId){
        return service.getJob(jobId);
    }

    @PostMapping(path="/jobPost",consumes="application/json")   //only consume json format
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        service.addJobPost(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{jobId}")
    public String deleteJob(@PathVariable("jobId") int jobId){
        service.deleteJob(jobId);
        return "Deleted";
    }
}
