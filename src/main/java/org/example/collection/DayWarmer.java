package org.example.collection;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class DayWarmer {
    public static ArrayList<Integer> findDayWarmer(ArrayList<Integer> inputArray){
        ArrayList<Integer> answerArray= new ArrayList<>();
        int key;
        int cnt;
        boolean found;
        int i = 0;
        int j;
        while(i < inputArray.size()-1){
//            System.out.println(answerArray.toString());
             key = inputArray.get(i);
             cnt = 0;
             found = false;
             if (key < inputArray.get(i+1)){
                 cnt++;
                 found =true;
                 answerArray.add(cnt);
             }
             else {
                 j = i+2;
                 cnt++;
                 while(!found && j < inputArray.size() ){
                     if(key < inputArray.get(j)){
                         cnt++;
                         found = true;
                         answerArray.add(cnt);
                         break;
                     }
                     else{
                         cnt++;
                         j++;
                     }
                 }
                 if(!found) {
                     answerArray.add(0);
                     i++;
                     continue;
                 }
             }
             i++;

        }
        answerArray.add(0);
        return answerArray;
    }

}
