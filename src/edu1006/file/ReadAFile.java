package edu1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadAFile {
    void fileList(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("./a_file.txt");

        char c = (char) fileReader.read();
        System.out.println(c);

    }
}
