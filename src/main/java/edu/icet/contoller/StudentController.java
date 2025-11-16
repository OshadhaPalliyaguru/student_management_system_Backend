package edu.icet.contoller;

import edu.icet.model.dto.StudentDto;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/register")
    public void add(@RequestBody StudentDto studentDto){

        studentService.add(studentDto);


    }

    @PutMapping("/update")
    public String update(@RequestBody StudentDto studentDto){
        return studentService.update(studentDto);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){

        return studentService.delete(id);
    }

    @GetMapping("/allStudents")
    public List<StudentDto> allStudents(){

     return studentService.allStudents();
    }

}
