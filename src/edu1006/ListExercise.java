package edu1006;

import edu1005.collection.Names;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;
    public ListExercise(){
        this.students  = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("김미지");
        this.students.add("김민경");
        this.students.add("김민지");
        this.students.add("김상호");
    }

    // 멋사 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList(){
        return this.students;
    }
}
