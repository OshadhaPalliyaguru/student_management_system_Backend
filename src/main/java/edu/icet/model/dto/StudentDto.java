package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {
    private Long id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String phonenumber;
    private String address;
    private String gradeLevel;
    private String email;

}
