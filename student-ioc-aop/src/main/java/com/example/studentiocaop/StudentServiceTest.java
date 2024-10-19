package com.example.studentiocaop;

import com.example.studentiocaop.model.Student;
import com.example.studentiocaop.service.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void testAddAndGetStudent() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "llt", "32201175");
        studentService.addStudent(student);

        Student retrieved = studentService.getStudent(1);
        assertNotNull(retrieved);
        assertEquals("John", retrieved.getName());
    }

    @Test
    public void testDeleteStudent() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "llt", "32201175");
        studentService.addStudent(student);
        studentService.deleteStudent(1);

        assertNull(studentService.getStudent(1));
    }

    @Test
    public void testModifyStudent() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "llt", "32201175");
        studentService.addStudent(student);
        studentService.modifyStudent(1, "ammllt", "32201175a");

        Student modified = studentService.getStudent(1);
        assertEquals("ammllt", modified.getName());
        assertEquals("32201175a", modified.getTele());
    }
}
