package com.example.demo.dto;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
public class EmployeeDto {

    private int id;
    @NotEmpty(message = "name must be filled")
    private String name;
    @NotEmpty(message = "email is mandatory")
    private String email;
    @NotEmpty(message = "Designation is mandatory")
    private String designation;
    private Long mobile;
    private String address;
    @NotEmpty(message = "Department is mandatory")
    private String department;
    @NotEmpty(message = "Enter the date of Joining")
    private LocalDate DOJ;
    private LocalDate dob;
    @NotEmpty(message = "Active or not active")
    private String status;
    @NotEmpty(message = "Whether full time or part time")
    private String employeeType;
    @NotEmpty(message = "Enter the name of the team lead")
    private int directManager;
    private String profileUrl;



}
