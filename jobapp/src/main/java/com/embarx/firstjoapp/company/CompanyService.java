package com.embarx.firstjoapp.company;
import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    boolean updateCompany(Long id, Company information);
    void createCompany(Company company);
    Company getCompanyById(Long id);
    boolean deleteCompany (Long id);
}
