package com.embarx.firstjoapp.job.impl;

import com.embarx.firstjoapp.job.Job;
import com.embarx.firstjoapp.job.JobRepository;
import com.embarx.firstjoapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

// ESSA CLASSE IMPLEMENTA O JOB_SERVICE, QUE É UMA CLASSE ABSTRATA (PODERIA SER FEITO TUDO LÁ, MAS FAZER ASSIM É QUESTÃO DE BOAS PRÁTICAS

@Service
public class JobServiceImpl implements JobService {

    // como não temos uma db ainda vamos retornar uma arraylist
    //private List<Job> jobs = new ArrayList<>();
    JobRepository jobRepository;

    // JOB REPOSITORY IS A ***BEAN THAT IS BEING MANAGED BY SPRING. WITH THIS CONSTRUCTOR IT WILL BE AUTOWIRED ON THE RUNTIME
    public JobServiceImpl(JobRepository jobRepository){
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id){
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean updateJob(Long id, Job information) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if (jobOptional.isPresent()) {
            Job job = jobOptional.get();
            job.setDescription(information.getDescription());
            job.setTitle(information.getTitle());
            job.setMinSalary(information.getMinSalary());
            job.setMaxSalary(information.getMaxSalary());
            job.setLocation(information.getLocation());
            jobRepository.save(job);
            return true;
        }
        return false;
    }
}
