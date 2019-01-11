package com.company;

import java.util.*;

public class SortInAscendingForm {
    public ArrayList<String > sortAscending(HashSet<String> input){


        Set<String> settree =new TreeSet<String>(input);
        Iterator<String > iterate = settree.iterator();
        ArrayList<String> list = new ArrayList<>();
        while(iterate.hasNext()){
            list.add(iterate.next());
        }
        return list;
    }
//    public static void main(String args[]){
//        Set<String> str = new HashSet<String >();
//        str.add("Harry");
//        str.add("Olive");
//        str.add("Alice");
//        str.add("Bluto");
//        str.add("Eugene");
//
//        SortInAscendingForm input = new SortInAscendingForm();
//
//        System.out.println(input.sortAscending((HashSet<String>) str));
//
//    }
}
