package edu1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

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

    public List<PopulationMove> readByLine(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        //BufferedReader는 삽
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            //System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
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



    //참고 코드
    public void readAllLines(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item->{
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove pm:pms){
            System.out.println(pm.getFromSido());
        }
    }

    //data를 PopulationMove로
    public PopulationMove parse(String data){
        //data: 50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528
        String[] dataArr = data.split(",");

//        return new PopulationMove(dataArr[6], dataArr[0]);      //from, to
        return new PopulationMove(dataArr[0], dataArr[1]);      //from, to

    }
    //파일 만들기
    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write합니다
    public void write(List<String> strs, String filename){
        File file = new File(filename);
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str: strs){
                writer.write(str);
            }
            writer.close();
        } catch(IOException e){

        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido()+","+populationMove.getToSido()+"\n";
    }


    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml ){
            String key = pm.getFromSido() +","+pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key,1);
            }
            moveCntMap.put(key, moveCntMap.get(key)+1);
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);

        return map;
    }

    public static void main(String[] args) throws IOException {
        //String address = "D:\\Lion\\2021_인구관련연간자료_20221006_02584.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
//        List<PopulationMove> pml = populationStatistics.readByLine(address);
//
//        System.out.println(pml.size());             //6209323
//
//        //매우 비효율적으로 500mb를 매번 읽고 있으므로 필요한 부분만 파일로 저장하자...!
//        for(PopulationMove pm: pml){
//            System.out.printf("전임:%s 전출:%s\n",pm.getFromSido(), pm.getToSido());
//        }



//        String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
//        PopulationMove pm = populationStatistics.parse(data);
//        System.out.println(pm.getFromSido());
//        System.out.println(pm.getToSido());

//        populationStatistics.createAFile("from_to.txt");


//        List<String> strings = new ArrayList<>();
//        strings.add("11,11");
//        populationStatistics.write(strings, "./from_to.txt");

//        List<PopulationMove> pml = populationStatistics.readByLine(address);
//
//        for(PopulationMove pm: pml){
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//        System.out.println(strings.size());
//        populationStatistics.write(strings,"./from_to.txt");

        String address = "./from_to.txt";
        List<PopulationMove> pml = populationStatistics.readByLine(address);

//        Set<Integer> sidoCodes = new HashSet<>();
//        for(PopulationMove pm: pml){
//            //System.out.printf("전임:%s 전출:%s\n",pm.getFromSido(), pm.getToSido());
//            sidoCodes.add(pm.getFromSido());
//            sidoCodes.add(pm.getToSido());
//        }
//
//        System.out.println(sidoCodes);

        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);
        Map<String, Integer> heatMapIdxMap = populationStatistics.heatmapIdxMap();
//        System.out.println(map);

        //populationStatistics.createAFile("each_sido_cnt.txt");
        populationStatistics.createAFile("for_heatMap.txt");
        //String targetFilename = "each_sido_cnt.txt";
        String forHeatMap = "for_heatMap.txt";
        List<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()){
//            System.out.printf("key:%s value:%d\n",key,map.get(key));

            String[] fromto = key.split(",");
//            String s = String.format("key:%s value:%d\n",key,map.get(key));
            String s = String.format("[%s, %s, %d],\n",heatMapIdxMap.get(fromto[0]),heatMapIdxMap.get(fromto[1]),map.get(key));
            cntResult.add(s);
        }

        populationStatistics.write(cntResult,forHeatMap);
    }
}
