package com.EducationLoan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer>{

}
