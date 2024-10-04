package com.embarx.firstjoapp.job;

import java.util.List;

// INTERFACE PARA DEFINIR MÉTODOS E VARIÁVEIS DO JOB DE FORMA ABSTRADA. DEVE SER DEFINIDA EM UM ARQUIVO IMPL

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job information);
}
