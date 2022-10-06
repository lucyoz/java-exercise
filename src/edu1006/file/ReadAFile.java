package edu1006.file;

import java.io.*;


public class ReadAFile {
    private String filename;

    public ReadAFile(String filename) {
        this.filename = filename;
    }

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
