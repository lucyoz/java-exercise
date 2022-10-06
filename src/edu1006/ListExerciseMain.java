package edu1006;

import edu1005.collection.LikeLion2th;

import java.util.List;

public class ListExerciseMain {

    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getStudentList();

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("개수: "+students.size());
    }
}
