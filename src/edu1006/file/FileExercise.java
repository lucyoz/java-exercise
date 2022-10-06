package edu1006.file;

import java.io.*;

public class FileExercise {

    private String filename;
    public FileExercise(String filename){
        this.filename = filename;
    }
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for( File file: files){
            System.out.println(file);
        }
    }
    public char readAChar() throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars() throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public String readNChars(int N) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for(int i=0;i<N;i++){
            str += (char) fileReader.read();
        }
        return str;
    }

    public String readALine() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename), 16*1024
        );
        String line;
        line = br.readLine();

        return line;
    }

    public String readNLine(int N) throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader(filename), 16*1024
        );
        String line = "";
        for(int i=0;i<N;i++){
            line = br.readLine()+"\n";
        }
        return line;
    }

    public static void main(String[] args) throws IOException {
        // ./는 현재 디렉토리

        FileExercise fileExercise = new FileExercise("./a_file.txt");
        char c = fileExercise.readAChar();
        System.out.println(c);

        String str = fileExercise.read2Chars();
        System.out.println(str);

        str = fileExercise.readNChars( 5);
        System.out.println(str);

        str = fileExercise.readALine();
        System.out.println(str);

        str = fileExercise.readNLine(2);
        System.out.println(str);
        /*
        h
        he
        hello
         */
    }
}
