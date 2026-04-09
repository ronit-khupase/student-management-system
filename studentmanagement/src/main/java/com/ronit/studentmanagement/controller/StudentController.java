package com.ronit.studentmanagement.controller;

import com.ronit.studentmanagement.dto.StudentDto;
import com.ronit.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public StudentDto create(@RequestBody StudentDto dto) {
        return service.createStudent(dto);
    }

    @GetMapping
    public List<StudentDto> getAll() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentDto update(@PathVariable Long id, @RequestBody StudentDto dto) {
        return service.updateStudent(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Deleted successfully";
    }
}
