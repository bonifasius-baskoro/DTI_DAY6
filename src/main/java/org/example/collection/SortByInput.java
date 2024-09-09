package org.example.collection;

import java.util.ArrayList;

public class SortByInput {

    public static ArrayList<Integer> sortArray(ArrayList<Integer>arrayInput, String sortOrder){
        switch(sortOrder){
            case "asc":
                sortArrayAsc(arrayInput);
                break;
            case "desc":
                sortArrayDesc(arrayInput);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        return arrayInput;

    }


    private static ArrayList<Integer> sortArrayAsc(ArrayList<Integer> arrayInput){
        int n = arrayInput.size();
//        System.out.println(arrayInput.toString());
        for(int i = 1 ; i < n ; i++){
            int key= arrayInput.get(i);
            int j = i -1;
//            System.out.println(key + " --key " + j + "-- initial j");
            // Move the element bigger than key look from back with j = i-1
            while(j>=0 && arrayInput.get(j) > key){
//                System.out.print ("j :" + j + " before sorted" + arrayInput.toString());
                arrayInput.set(j+1, arrayInput.get(j));
                j = j-1;
//                System.out.println(" j: "+j+" after sorted" + arrayInput.toString());
            }
            arrayInput.set(j+1, key);
//            System.out.println("after set after while: "+arrayInput.toString());
        }
        return arrayInput;
    }

    private static ArrayList<Integer> sortArrayDesc(ArrayList<Integer> arrayInput){
        int n = arrayInput.size();
//        System.out.println(arrayInput.toString());
        for(int i = 1 ; i < n ; i++){
            int key= arrayInput.get(i);
            int j = i -1;
//            System.out.println(key + " --key " + j + "-- initial j");
            // Move the element bigger than key look from back with j = i-1
            while(j>=0 && arrayInput.get(j) < key){
//                System.out.print ("j :" + j + " before sorted" + arrayInput.toString());
                arrayInput.set(j+1, arrayInput.get(j));
                j = j-1;
//                System.out.println(" j: "+j+" after sorted" + arrayInput.toString());
            }
            arrayInput.set(j+1, key);
//            System.out.println("after set after while: "+arrayInput.toString());
        }
        return arrayInput;
    }
}
