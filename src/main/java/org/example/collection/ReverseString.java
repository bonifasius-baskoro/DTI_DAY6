package org.example.collection;

public class ReverseString {
    public static String reverseString(String input){
        StringBuilder output = new StringBuilder("");
        for(int i = input.length()-1 ; i>=0 ; i--){
            StringBuilder stringTemp = new StringBuilder(""+input.charAt(i));
            output = output.append(stringTemp);
        }
        return output.toString();
    }
}
