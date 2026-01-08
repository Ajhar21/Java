package com.ztrios.SpringRest.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ztrios.SpringRest.model.JobPost;

@Repository
public class JobRepo {

	// arrayList to store store JobPost objects
	List<JobPost> jobs = new ArrayList<>();

	// ****************************************************************************

	// constructor->injecting objects into ArrayList defined above.
	public JobRepo() {

		// Java Developer Job Post
		jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

		// Frontend Developer Job Post
		jobs.add(
				new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
						3, List.of("HTML", "CSS", "JavaScript", "React")));

		// Data Scientist Job Post
		jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
				List.of("Python", "Machine Learning", "Data Analysis")));

		// Network Engineer Job Post
		jobs.add(new JobPost(4, "Network Engineer",
				"Design and implement computer networks for efficient data communication", 5,
				List.of("Networking", "Cisco", "Routing", "Switching")));

		// Mobile App Developer Job Post
		jobs
				.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
						3, List.of("iOS Development", "Android Development", "Mobile App")));

	

	}

	// ****************************************************************************

	// method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return jobs;
	}

	// method to save a job post object into arrayList
	public void addJobPost(JobPost job) {
		jobs.add(job);

	}

    public JobPost getJob(int jobId) {
        for(JobPost job:jobs){
            if(job.getPostId()==jobId){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost job:jobs){
            if(job.getPostId()==jobPost.getPostId()){
                job.setPostId(jobPost.getPostId());
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int jobId) {
        for(JobPost job:jobs){
            if(job.getPostId()==jobId){
                jobs.remove(job);
            }
        }
    }
}
