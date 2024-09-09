package org.example.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveElement {
    public static ArrayList<Integer> removeElement(ArrayList<Integer> inputArray, int element){
        ArrayList<Integer>  tempArray = new ArrayList<Integer>();
        for (Integer i : inputArray) {
            if (i != element) {
                tempArray.add(i);
            }
            };
        return tempArray;
    }
}
