package org.example.collection;

import java.util.ArrayList;

public class ArrayRotation {

    public static ArrayList<Integer> arrayRotate(ArrayList<Integer> input, int d ){
        ArrayList<Integer> arrayTemp = new ArrayList<Integer>();
        if(d > input.size()){
            System.out.println("the input must lower than array length");
            return input;
        }
        int cnt = 0;
        while(cnt<d){
            arrayTemp.add(input.get(0));
            input.remove(0);
            cnt++;
        }
        input.addAll(arrayTemp);
        return input;
    }
}
