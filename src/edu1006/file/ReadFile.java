package edu1006.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    //지정한 파일의 맨 앞 한 byte를 읽는 method
    private String filneme;

    public ReadFile(String filneme) {
        this.filneme = filneme;
    }

    void readAByte(String filename){
        char c;
        try(BufferedReader br = Files.newBufferedReader(
                    Paths.get(filename), StandardCharsets.UTF_8)){

            if ((br.readLine() != null)){
                c = br.readLine().charAt(0);
                System.out.println(c);
            }

            } catch (IOException e){
                throw new RuntimeException(e);
            }
    }

    public static void main(String[] args) {

        ReadFile readFile = new ReadFile("./a_file.txt");
        readFile.readAByte("./a_file.txt");


    }
}
