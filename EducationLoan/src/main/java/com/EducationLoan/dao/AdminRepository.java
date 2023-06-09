package com.EducationLoan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan.model.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel,String>{

}
