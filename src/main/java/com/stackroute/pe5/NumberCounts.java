/*
Write a program to find the number of counts in the following  String .
Store the output inMap< String ,Integer> as key value pair.
Input :   String  str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
 */

package com.stackroute.pe5;

import java.util.*;

public class NumberCounts {

    public Map<String,Integer> numberCount(String input)
    {
            //remove all special char and replace withe empty space
            String result = input.replaceAll("[^\\w\\s]+", " ");

            // remove the underscore from the input and replace with space
            String result1 = result.replaceAll("[_ ]+", " ");

            //string array initialized and splited input wrt spaces
            String a[] = result1.split(" ");

            //create a map and store result
            Map<String, Integer> words = new HashMap<>();

            //iterate through words if found increment with the elements
            for (String str : a) {
                if (words.containsKey(str)) {
                    words.put(str, 1 + words.get(str));
                } else {
                    words.put(str, 1);
                }
            }
            return words;
        }
}
