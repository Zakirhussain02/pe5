/*
Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:a. If the key `val1` has a value, set the key `val2` to have that value, andb. Set the key `val1` to have the value `"  "` (empty string ).
Example 1:The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}
Example 2:The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":"mars"}
 */

package com.stackroute.pe5;

import java.util.*;
import java.util.Map;

public class ModifyMap{

    public LinkedHashMap<String,String > ModifykeyValues(LinkedHashMap<String,String>input) {

        //iterate through items
        Iterator inputIterator=input.entrySet().iterator();
        Map.Entry mapElement=(Map.Entry)inputIterator.next();

        //first value and key
        String keyOne=(String)mapElement.getKey();
        String valueOne=(String)mapElement.getValue();

        //second value and key
        mapElement=(Map.Entry)inputIterator.next();
        String keyTwo=(String)mapElement.getKey();
        String valueTwo=(String)mapElement.getValue();

        //other than null then change the values
        if(valueOne!=null)
        {
            valueTwo=valueOne;
            input.put(keyOne," ");
            input.put(keyTwo,valueTwo);
        }
        //return the output
        return input;

    }


}