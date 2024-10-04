package com.embarx.firstjoapp.company.impl;

import com.embarx.firstjoapp.company.Company;
import com.embarx.firstjoapp.company.CompanyRepository;
import com.embarx.firstjoapp.company.CompanyService;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void createCompany(Company company){
        companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id){
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public boolean updateCompany(Long id, Company information){
        Optional<Company> companyOptional = companyRepository.findById(id);
        if (companyOptional.isPresent()){
            Company company = companyOptional.get();
            company.setDescription(information.getDescription());
            company.setName(information.getName());
            company.setJobs(information.getJobs());
            companyRepository.save(company);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCompany(Long id) {
        try {
            companyRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
