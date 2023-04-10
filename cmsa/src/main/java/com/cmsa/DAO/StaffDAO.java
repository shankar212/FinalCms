
package com.cmsa.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmsa.Model.StaffModel;

public interface StaffDAO extends JpaRepository<StaffModel,Integer>{

//	public StudentModel findByEmail(String email);
//
//	public StudentModel findByEmailAndPassword(String email, String password);

	Optional<StaffModel> findById(String email);

	StaffModel findByEmail(String email);

	
}
