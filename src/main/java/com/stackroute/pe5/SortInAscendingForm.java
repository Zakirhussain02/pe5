/*
Write a program to implement set interface which sorts the given randomly ordered names inascending order.
Convert the sorted set in to an  array list
Input : Harry  Olive  Alice  Bluto  Eugene
Output :Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
Array list  from Set :  Alice Bluto Eugene Harry Olive
 */

package com.stackroute.pe5;

import java.util.*;

public class SortInAscendingForm {
    public ArrayList<String > sortAscending(HashSet<String> input){

        //finding unique elements
        Set<String> settree =new TreeSet<String>(input);

        //iter items
        Iterator<String > iterate = settree.iterator();

        //creating list
        ArrayList<String> list = new ArrayList<>();

        //iter through list
        while(iterate.hasNext()){
            list.add(iterate.next());
        }
        return list;
    }

}
