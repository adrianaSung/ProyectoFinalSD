package com.outatime.app.repositories;

import com.outatime.app.models.*;
import java.util.*;

public class StudentRepositoryImpl implements IStudentRepository{
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student("Daniel","Sanchez","Computing Engineering",1L),
                new Student("Ivan","Sanchez","Civil Engineering",2L),
                new Student("Adriana","Herrera","Computing Engineering",3L),
                new Student("Yolanda","De Jesus","Computing Engineering",4L)
        );

    @Override
    public List<Student> getStudents() {
        System.out.println("Using getStudents() from: " + getClass().getSimpleName());
        return this.STUDENTS;
    }

    @Override
    public boolean addStudent(Student student) {
        return STUDENTS.add(student);
    }

}
