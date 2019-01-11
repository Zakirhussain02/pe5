import java.util.*;

public class BooleanMap {

    public Map<String, Boolean> numberCount(String[] input) {
//        if(input == null)
//           // return null;
//        else {
        //String a[];
        Map<String, Boolean> words = new HashMap<>();
        for (String str : input) {
            if (words.containsKey(str)) {
                words.put(str, true);
            } else {
                words.put(str, false);
            }
            //}
            //  System.out.println(words);
        }
        return words;
    }


    /*public static void main(String[] args) {

        String[] s ={"a","b","c","d","a","c","c"};
        NumberCounts x=new NumberCounts();
        //Map h=x.numberCount(s);
        System.out.println(h);
    }*/
}