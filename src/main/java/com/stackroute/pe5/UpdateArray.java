/*
Write a Java program to update specific array element by given element and empty the  array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
* */

package com.stackroute.pe5;

import java.util.Collections;
import java.util.List;

public class UpdateArray {

    public List<String> upDateList(List<String> strings, String elementToBeReplaced, String replaceWith) {

        //get the index of element to be replaced
        int index = strings.indexOf(elementToBeReplaced);

        //if input is null or index is -1
        if (strings==null||elementToBeReplaced==null||replaceWith==null||index==-1){
            System.out.println("List or string is null or empty");
            return Collections.emptyList();
        }

        //replace the elements other elements
        strings.set(index, replaceWith);
        return strings;
    }
}
