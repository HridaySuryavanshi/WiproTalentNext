package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {

    /**
     * Calculates the grade for a student based on their marks.
     * The grading criteria are assumed as:
     * < 150 marks = F
     * 150 to 200 = D
     * 201 to 250 = C
     * 251 to 300 = B
     * > 300 = A
     */
    public String findGrade(Student studentObject) {
        int sum = 0;
        for (int mark : studentObject.getMarks()) {
            sum += mark;
        }

        if (sum < 150) return "F";
        else if (sum >= 150 && sum <= 200) return "D";
        else if (sum > 200 && sum <= 250) return "C";
        else if (sum > 250 && sum <= 300) return "B";
        else return "A";
    }

    /**
     * Validates a Student object.
     * Throws an exception if the object is null, or if the name or marks array are null.
     */
    public String validate(Student studentObject) throws NullStudentException, NullNameException, NullMarksArrayException {
        if (studentObject == null) {
            throw new NullStudentException();
        } else {
            if (studentObject.getName() == null) {
                throw new NullNameException();
            }
            if (studentObject.getMarks() == null) {
                throw new NullMarksArrayException();
            }
        }
        // If no exceptions are thrown, the object is valid
        return "VALID";
    }
}
