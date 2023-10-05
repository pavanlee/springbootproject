package com.demo.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootCrud.bean.Subject;
import com.demo.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	public SubjectRepository subjectRepository;

	public List<Subject> getAllSubjects() {

		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;

	}

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);

	}

	public void updateSubject(Subject subject) {
		subjectRepository.save(subject);

	}

	public void deleteSubject(String id) {
		subjectRepository.deleteById(id);

	}

}
