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

    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public String readNChars(String filename, int N) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for(int i=0;i<N;i++){
            str += (char) fileReader.read();
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        // ./는 현재 디렉토리

        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./a_file.txt");
        System.out.println(c);

        String str = fileExercise.read2Chars("./a_file.txt");
        System.out.println(str);

        str = fileExercise.readNChars("./a_file.txt", 5);
        System.out.println(str);
        /*
        h
        he
        hello
         */
    }
}
