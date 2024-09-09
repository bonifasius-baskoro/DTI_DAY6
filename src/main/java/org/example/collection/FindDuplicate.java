package org.example.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicate {
    public static ArrayList<Integer> findDuplicate(ArrayList<Integer> input){
        ArrayList<Integer> tempArray = new ArrayList<>();
        HashMap<Integer,Integer> checkMap = new HashMap<>();
        for (Integer integer : input) {
            if (!checkMap.containsKey(integer)) {
                checkMap.put(integer, 1);
            } else {
                checkMap.put(integer, checkMap.get(integer) + 1);
            }
        }
       checkMap.forEach((key,value)->{
           if (value >1){
               tempArray.add(key);
           }
       });
        return tempArray;
    }
}
