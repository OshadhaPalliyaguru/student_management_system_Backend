package edu.icet.service;

import edu.icet.model.dto.StudentDto;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void add(StudentDto studentDto){

        studentRepository.save(new StudentEntity(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getDob(),
                studentDto.getGender(),
                studentDto.getPhonenumber(),
                studentDto.getAddress(),
                studentDto.getGradeLevel(),
                studentDto.getEmail()

        ));
    }













}
