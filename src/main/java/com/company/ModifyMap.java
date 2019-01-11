package com.company;
//import java.util.*;
//
//public class ModifyMap {
//    public Map<String, String> Modifymap() {
//        HashMap<String, String> hash_map = new HashMap<String, String>();
//
//        // Mapping string values to int keys
//        hash_map.put("val2", "c++");
//        hash_map.put("val1", "java");
//
//        //System.out.println(hash_map);
//        hash_map.replace("val2","c++","java");
//        hash_map.replace("val1","java"," ");
//
//        System.out.println(hash_map);
//        return hash_map;
//    }
//    public static void main(String[] a){
//        ModifyMap x =new ModifyMap();
//        Map h = x.Modifymap();
//        //System.out.println(h);
//    }
//}
import java.util.*;
import java.util.Map;

public class ModifyMap{

    public LinkedHashMap<String,String > ModifykeyValues(LinkedHashMap<String,String>input) {


        Iterator inputIterator=input.entrySet().iterator();
        Map.Entry mapElement=(Map.Entry)inputIterator.next();

        String keyOne=(String)mapElement.getKey();
        String valueOne=(String)mapElement.getValue();

        mapElement=(Map.Entry)inputIterator.next();
        String keyTwo=(String)mapElement.getKey();
        String valueTwo=(String)mapElement.getValue();

        if(valueOne!=null)
        {
            valueTwo=valueOne;
            input.put(keyOne," ");
            input.put(keyTwo,valueTwo);
        }
        return input;

    }


}