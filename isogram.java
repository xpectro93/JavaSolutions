// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that
determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. 
Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case 
*/
import java.util.*;

public class isogram {
    public static boolean  isIsogram(String str) {
      //turn string into array?List?
       char[] letters = str.toCharArray();
        
        //create set to store unique values
       Set<Character> seen = new HashSet<>();

       //use the equivalent of a for-of loop
       for(char letter : letters){

        //turn every character to lowercase before adding to set
        char lower = Character.toLowerCase(letter);

        //Adds the specified element to this set if it is not already present.// returns boolean
        if (!seen.add(lower)) {
          return false;
        }
        
       }
       //if the element doesnt go through if statement we can return true, which means there were no repeated elems
       return true;
    } 
}
