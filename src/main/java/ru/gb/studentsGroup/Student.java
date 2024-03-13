package ru.gb.studentsGroup;

public class Student {

    private static int curId=1;
    private final int id;
    private String studentName;
    private String groupName;

    public Student(String studentName, String groupName) {
        this.id = curId++;
        this.studentName = studentName;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "studentName='" + studentName + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

//    public String nameLength() {
//        return (String) this;
//    }
}
