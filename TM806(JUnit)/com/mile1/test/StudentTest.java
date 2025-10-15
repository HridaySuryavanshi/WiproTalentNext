package com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    StudentReport studentReport = new StudentReport();
    StudentService studentService = new StudentService();

    // Test data for various scenarios
    static Student studentData[] = new Student[8];
    static {
        studentData[0] = new Student("Alice", new int[]{90, 95, 98});   // TC1: Grade A
        studentData[1] = new Student("Bob", new int[]{50, 50, 55});     // TC2: Grade D
        studentData[2] = new Student("Charlie", new int[]{40, 45, 30}); // TC3: Grade F
        studentData[3] = null;                                          // TC8: Null Object
        studentData[4] = new Student(null, new int[]{70, 75, 80});      // TC5, TC7: Null Name
        studentData[5] = new Student("David", null);                   // TC6, TC9: Null Marks
        studentData[6] = new Student("Eve", new int[]{80, 85, 90});
        studentData[7] = null;                                          // TC8: Null Object
    }
    
    // TC1: Check for A grade computation.
    @Test
    void test_findGrade_A() {
        assertEquals("A", studentReport.findGrade(studentData[0]));
    }

    // TC2: Check for D grade computation.
    @Test
    void test_findGrade_D() {
        assertEquals("D", studentReport.findGrade(studentData[1]));
    }

    // TC3: Check for F grade computation.
    @Test
    void test_findGrade_F() {
        assertEquals("F", studentReport.findGrade(studentData[2]));
    }

    // TC4: Throw NullStudentException if the Object is null.
    @Test
    void test_validate_NullStudent() {
        assertThrows(NullStudentException.class, () -> studentReport.validate(null));
    }
    
    // TC5: Throw NullNameException if the Name is null.
    @Test
    void test_validate_NullName() {
        assertThrows(NullNameException.class, () -> studentReport.validate(studentData[4]));
    }

    // TC6: Throw NullMarksArrayException if the Marks array is null.
    @Test
    void test_validate_NullMarks() {
        assertThrows(NullMarksArrayException.class, () -> studentReport.validate(studentData[5]));
    }
    
    // TC7: Test findNumberOfNullName function.
    @Test
    void test_findNumberOfNullName() {
        assertEquals(1, studentService.findNumberOfNullName(studentData));
    }
    
    // TC8: Test findNumberOfNullObjects function.
    @Test
    void test_findNumberOfNullObjects() {
        assertEquals(2, studentService.findNumberOfNullObjects(studentData));
    }
    
    // TC9: Test findNumberOfNullMarks function.
    @Test
    void test_findNumberOfNullMarks() {
        assertEquals(1, studentService.findNumberOfNullMarks(studentData));
    }
}