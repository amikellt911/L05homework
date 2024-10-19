package com.example.studentiocaop.service;

import com.example.studentiocaop.model.Student;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
    private Map<Integer, Student> studentMap = new HashMap<>();

    // 添加学生
    public void addStudent(Student student) {
        studentMap.put(student.getSid(), student);
        System.out.println("Added student: " + student);
    }

    // 删除学生
    public void deleteStudent(int sid) {
        if (studentMap.containsKey(sid)) {
            Student removedStudent = studentMap.remove(sid);
            System.out.println("Deleted student: " + removedStudent);
        } else {
            throw new RuntimeException("Student with ID " + sid + " not found");
        }
    }

    // 修改学生信息
    public void modifyStudent(int sid, String name, String tele) {
        if (studentMap.containsKey(sid)) {
            Student student = studentMap.get(sid);
            student.setName(name);
            student.setTele(tele);
            System.out.println("Modified student: " + student);
        } else {
            throw new RuntimeException("Student with ID " + sid + " not found");
        }
    }

    // 查询学生信息
    public Student getStudent(int sid) {
        return studentMap.get(sid);
    }
}
