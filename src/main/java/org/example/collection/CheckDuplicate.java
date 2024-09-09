package org.example.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CheckDuplicate {
    public static boolean checkDuplicate(ArrayList<Integer> input){
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        for(int i = 0 ; i <input.size();i++){
            if(!tempArray.contains(input.get(i))){
                tempArray.add(input.get(i));
            }
            else{
                return true;
            }
        }
        return false;
    }
}
