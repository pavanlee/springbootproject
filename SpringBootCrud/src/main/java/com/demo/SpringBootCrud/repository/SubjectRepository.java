package com.demo.SpringBootCrud.repository;


import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.demo.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

	@Override
	ArrayList<Subject> findAll();

}
