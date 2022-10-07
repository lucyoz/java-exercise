package edu1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {
    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        //파일을 아직 읽지 않는 상태

        String fileContents = "";
        while(fileContents.length()<1000000){
            char c = (char)fileReader.read();  //read()명령어에서 파일을 읽음
            fileContents += c;
        }

        System.out.println(fileContents);
    }

    public void readByLine(String filename) throws IOException {
        //FileReader
        //BufferedReader는 삽
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);}

        reader.close();

    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename),StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //data를 PopulationMove로
    public PopulationMove parse(String data){
        String[] dataArr = data.split(",");
        int fromSido = Integer.parseInt(dataArr[0]);
        int toSido = Integer.parseInt(dataArr[6]);

        return new PopulationMove(fromSido, toSido);

    }


    public static void main(String[] args) throws IOException {
        String address = "D:\\Lion\\2021_인구관련연간자료_20221006_02584.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(address);



    }
}
