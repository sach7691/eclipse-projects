package com.ab.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ab.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{ //Integer because primary key is an integer

	
	@Modifying
	@Transactional
	@Query("UPDATE Student s SET s.email = :email WHERE s.id=:id")
	public Optional<Integer> updateByEmail(@Param("id") int id,@Param("email") String email);
	
}
