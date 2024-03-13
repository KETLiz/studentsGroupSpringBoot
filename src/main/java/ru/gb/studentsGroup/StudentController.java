package ru.gb.studentsGroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    StudentRepository repository;
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }
    @GetMapping("student")
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return repository.getStudentById(id);
    }

    @GetMapping("group/{groupName}/student")
    public List<Student> getStudentsByGroupName(@PathVariable String groupName) {
       return repository.getStudentByGroupName(groupName);
    }

    @GetMapping("student/search")
    public List<Student> getNameBySubstring(@RequestParam String name) {
        return repository.getNameBySubstring(name);
    }
}
