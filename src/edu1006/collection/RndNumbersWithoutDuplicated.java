package edu1006.collection;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> set1 = new HashSet<>();

        for(int i=0;i<100;i++) {
            int r = randomNumberGenerator.generate(20);
            //System.out.println(r);
            set1.add(r);
        }

        System.out.println(set1);
        System.out.println("총 "+set1.size()+"개");
    }
}
