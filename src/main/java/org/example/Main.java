package org.example;

import org.example.collection.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

//        /* Part 1 to rotate array based on input */
//        ArrayList<Integer> part1Input = new ArrayList<Integer>();
//        for (int i = 1 ; i < 8 ; i++){
//            part1Input.add(i);
//        }
//        System.out.println(part1Input.toString());
//        System.out.println(ArrayRotation.arrayRotate(part1Input,2).toString());
//
//        // Part 2 - Check if Array contain duplicates value
//        ArrayList<Integer> part2Input = new ArrayList<Integer>();
//        part2Input.add(1);
//        part2Input.add(1);
//        part2Input.add(2);
//        part2Input.add(3);
//        part2Input.add(4);
//
//        System.out.println(CheckDuplicate.checkDuplicate(part2Input));
//
//        //Part 3 Remove duplicate from the list
//        ArrayList<Integer> part3Input = new ArrayList<Integer>();
//
//        part3Input.add(1);
//        part3Input.add(2);
//        part3Input.add(4);
//        part3Input.add(3);
//        part3Input.add(2);
//        part3Input.add(5);
//        part3Input.add(3);
//        part3Input.add(3);
//        part3Input.add(4);
//        part3Input.add(4);
//
//
//        System.out.println(RemoveDuplicate.removeDuplicate(part3Input).toString());


        // Sort array in increasing & decreasing
        ArrayList<Integer> inputPart3_2= new ArrayList<Integer>();
        inputPart3_2.add(3);
        inputPart3_2.add(5);
        inputPart3_2.add(2);
        inputPart3_2.add(1);
        inputPart3_2.add(4);
        System.out.println("Before sorted:" + inputPart3_2.toString());
        System.out.println("after Sorted:"+ SortByInput.sortArray(inputPart3_2,"desc").toString());

        //Part 4

        System.out.println("Part 4 --------");
        ArrayList<Integer> part4Input = new ArrayList<Integer>();

        part4Input.add(1);
        part4Input.add(2);
        part4Input.add(4);
        part4Input.add(3);
        part4Input.add(2);
        part4Input.add(5);
        part4Input.add(3);
        part4Input.add(3);
        part4Input.add(4);
        part4Input.add(4);
        int element = 2;
        System.out.println("Before remove the element : " + element + " array: "+ part4Input );
        System.out.println("AFter removing the element: " +RemoveElement.removeElement(part4Input,2).toString());

        //Part 5
        String inputPart5 = "ayam";
        System.out.println("String : " + inputPart5 + " Reversed String : " + ReverseString.reverseString(inputPart5));

        //Part 6
        System.out.println("Part 6 --------");
        ArrayList<Integer> part6Input = new ArrayList<Integer>();

        part6Input.add(1);
        part6Input.add(2);
        part6Input.add(4);
        part6Input.add(3);
        part6Input.add(2);
        part6Input.add(5);
        part6Input.add(3);
        part6Input.add(3);
        part6Input.add(4);
        part6Input.add(4);

        System.out.println("List to find duplicates " + part6Input.toString());
        System.out.println("Duplicate in the list :" + FindDuplicate.findDuplicate(part6Input).toString());

        //Part 7

        ArrayList<Integer> part7Input = new ArrayList<>();
        part7Input.add(73);
        part7Input.add(74);
        part7Input.add(75);
        part7Input.add(71);
        part7Input.add(69);
        part7Input.add(72);
        part7Input.add(76);
        part7Input.add(73);
        System.out.println("Temperatures = " + part7Input.toString());
        System.out.println("Output " + DayWarmer.findDayWarmer(part7Input).toString());

        ArrayList<Integer> part7_2Input = new ArrayList<>();
        part7_2Input.add(30);
        part7_2Input.add(40);
        part7_2Input.add(50);
        part7_2Input.add(60);
        System.out.println("Temperatures = " + part7_2Input.toString());
        System.out.println("Output " + DayWarmer.findDayWarmer(part7_2Input).toString());

    }
}