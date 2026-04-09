package com.ronit.studentmanagement.service;

import com.ronit.studentmanagement.dto.StudentDto;
import com.ronit.studentmanagement.entity.Student;
import com.ronit.studentmanagement.exception.ResourceNotFoundException;
import com.ronit.studentmanagement.mapper.StudentMapper;
import com.ronit.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentDto createStudent(StudentDto dto) {
        Student student = StudentMapper.toEntity(dto);
        Student saved = repository.save(student);
        return StudentMapper.toDto(saved);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return repository.findAll()
                .stream()
                .map(StudentMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        return StudentMapper.toDto(student);
    }

    @Override
    public StudentDto updateStudent(Long id, StudentDto dto) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());

        return StudentMapper.toDto(repository.save(student));
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        repository.delete(student);
    }
}
