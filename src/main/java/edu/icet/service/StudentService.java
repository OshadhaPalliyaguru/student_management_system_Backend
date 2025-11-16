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


    public String update(StudentDto studentDto){

        StudentEntity studentEntity = studentRepository.findById(studentDto.getId()).get();

        studentEntity.setName(studentDto.getName());
        studentEntity.setDob(studentDto.getDob());
        studentEntity.setGender(studentDto.getGender());
        studentEntity.setPhonenumber(studentDto.getPhonenumber());
        studentEntity.setAddress(studentDto.getAddress());
        studentEntity.setGradeLevel(studentDto.getGradeLevel());
        studentEntity.setEmail(studentDto.getEmail());

        studentRepository.save(studentEntity);

        return "Updated Sucessfull";


    }

    public String delete(String id){
        studentRepository.deleteById(Long.valueOf(id));
        return "deleted sucessfull";
    }


    public List<StudentDto> allStudents(){
        List<StudentEntity> allstudents = studentRepository.findAll();
        ArrayList<StudentDto> studentDtoArrayList = new ArrayList<>();

        for (StudentEntity studentEntity : allstudents){
            studentDtoArrayList.add(new StudentDto(
                    studentEntity.getId(),
                    studentEntity.getName(),
                    studentEntity.getDob(),
                    studentEntity.getGender(),
                    studentEntity.getPhonenumber(),
                    studentEntity.getAddress(),
                    studentEntity.getGradeLevel(),
                    studentEntity.getEmail()
            ));
        }
        return studentDtoArrayList;
    }











}
