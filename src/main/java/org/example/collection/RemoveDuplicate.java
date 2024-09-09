package org.example.collection;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static ArrayList<Integer> removeDuplicate (ArrayList<Integer> input){
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        for(int i = 0 ; i <input.size();i++){
            if(!tempArray.contains(input.get(i))){
                tempArray.add(input.get(i));
            }
            else{
                input.remove(i);
                i--;
            }
        }
        return input;
    }
}
