package com.EducationLoan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan.model.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel,Integer>{

}
