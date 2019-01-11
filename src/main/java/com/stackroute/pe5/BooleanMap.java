/*
Write a program where an array of strings is input and output is a Map< String ,boolean> whereeach different  string  is a key and its value is true if that  string  appears 2 or more times in the array
Input : String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */

package com.stackroute.pe5;

import java.util.*;

public class BooleanMap {

    public Map<String, Boolean> numberCount(String[] input) {

        //creating map
        Map<String, Boolean> words = new HashMap<>();

        //iterating elements in words
        for (String str : input) {
            if (words.containsKey(str)) {
                words.put(str, true);
            } else {
                words.put(str, false);
            }

        }

        //returining the elements
        return words;
    }
}