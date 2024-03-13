package ru.gb.studentsGroup;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student("Mari", "developer"));
        students.add(new Student("Roman", "tester"));
        students.add(new Student("Nik", "tester "));
        students.add(new Student("Nikolay", "developer"));
        students.add(new Student("Roma", "tester"));
        students.add(new Student("Masha", "devOps"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getStudentByGroupName(String groupName) {
        List<Student> studentsInOneGroup = new ArrayList<>();

        for(Student student : students) {
            if(student.getGroupName().equals(groupName)) {
                studentsInOneGroup.add(student);
            }
        }
        return studentsInOneGroup;
    }

    public List<Student> getNameBySubstring(String substring) {
        List<Student> searchNameBySubstring = new ArrayList<>();

        for(Student student : students) {
            if(student.getStudentName().contains(substring)) {
                searchNameBySubstring.add(student);
            }
        }
        return searchNameBySubstring;
    }
}
