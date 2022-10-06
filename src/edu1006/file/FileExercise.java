package edu1006.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for( File file: files){
            System.out.println(file);
        }
    }
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();

    }


    public static void main(String[] args) throws IOException {
        // ./는 현재 디렉토리

        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./a_file.txt");
        System.out.println(c);

        /*
        h
         */
    }
}
