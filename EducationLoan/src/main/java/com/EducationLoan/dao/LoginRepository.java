package com.EducationLoan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel,String>{

}
