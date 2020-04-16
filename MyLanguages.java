/*
https://www.codewars.com/kata/5b16490986b6d336c900007d/train/java
You are given a dictionary/hash/object containing some languages and your test results in the given languages. 
Return the list of languages where your test score is at least 60, in descending order of the results.

Note: the scores will always be unique (so no duplicate values)

Examples
{"Java" => 10, "Ruby" => 80, "Python" => 65}   -->  ["Ruby", "Python"]
{"Hindi" => 60, "Dutch" => 93, "Greek" => 71}  -->  ["Dutch", "Greek", "Hindi"]
{"C++" => 50, "ASM" => 10, "Haskell" => 20}    -->  []
*/

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class MyLanguages {
  public static List<String> myLanguages(final Map<String, Integer> results) {
    //create new ArrayList
    List<String> list= new ArrayList<String>();

    //create forEach for Map
    for (Map.Entry<String, Integer> entry : results.entrySet())

    //If value of key is greater than or equal to 60 
     if(entry.getValue()>= 60){
    
      //adds to our string array
     list.add(entry.getKey());
     };

     //import collections sort
     Collections.sort(list, (a, b) -> { 
              //use Integeger because our results are whole numbers. then we compare their values based on the strings we previously got
              //we use the map get method to get the integer value, then based on that we sort.
        return Integer.compare(results.get(b), results.get(a));

     });
     //return sorted arraylist
    return list;
  }
 
};