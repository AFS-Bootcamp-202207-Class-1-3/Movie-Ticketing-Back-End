package com.cool.movie.mapper;

import com.cool.movie.model.entity.Company;
import com.cool.movie.model.dto.CompanyRequest;
import com.cool.movie.model.dto.CompanyResponse;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {
    public CompanyResponse toResponse(Company company) {
        CompanyResponse response = new CompanyResponse();

        // Manually
        response.setCompanyName(company.getCompanyName());
        response.setId(company.getId());
        response.setEmployees(company.getEmployees());
        response.setEmployeeNumber(company.getEmployees().size());

        // BeanUtils
        // BeanUtils.copyProperties(company, response);
        // response.setEmployeeNumber(company.getEmployees().size());

        return response;
    }

    public Company toEntity(CompanyRequest companyRequest) {
        Company company = new Company();

        // Manually
        company.setCompanyName(companyRequest.getCompanyName());

        // BeanUtils
        // BeanUtils.copyProperties(companyRequest, company);

        return company;
    }
}
