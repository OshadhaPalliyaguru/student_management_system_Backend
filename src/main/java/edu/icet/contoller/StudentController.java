package edu.icet.contoller;

import edu.icet.model.dto.StudentDto;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/register")
    public void add(@RequestBody StudentDto studentDto){

        studentService.add(studentDto);


    }
}
