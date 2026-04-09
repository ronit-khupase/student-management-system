package com.ronit.studentmanagement.mapper;

import com.ronit.studentmanagement.dto.StudentDto;
import com.ronit.studentmanagement.entity.Student;

public class StudentMapper {
    public static StudentDto toDto(Student student) {
        return new StudentDto(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getCourse()
        );
    }

    public static Student toEntity(StudentDto dto) {
        return new Student(
                dto.getId(),
                dto.getName(),
                dto.getEmail(),
                dto.getCourse()
        );
    }
}
