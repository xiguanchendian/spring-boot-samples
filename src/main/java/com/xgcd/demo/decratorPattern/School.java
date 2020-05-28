package com.xgcd.demo.decratorPattern;

import java.util.ArrayList;

public class School implements IStudent {
    private ArrayList<IStudent> students = new ArrayList<>();

    public void addStudent(IStudent student) {
        students.add(student);
    }

    @Override
    public void readBook() {
        for (IStudent student : students) {
            student.readBook();
        }
    }
}
