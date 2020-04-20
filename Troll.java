/* 
https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/

import java.util.HashSet;

public class Troll {
    public static String disemvowel(String str) {
        //create HashSet for o(1) lookup;
        HashSet<Character> vowels = new HashSet<Character>();
        //NOTE TO SELF: Remember that '' are used to characters and "" are used for strings;
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        String out = "";
        for (int i = 0; i < str.length(); i++){
            // loop through and if vowels set does not contain vowels add to output string
            if(!vowels.contains(str.charAt(i))){
                out+=str.charAt(i);
            }
        }
        
        //return output;
        return out;
    }
    public static void main(String[] str){
        System.out.print(disemvowel("This is WORKING"));
        System.out.print(disemvowel("ADKSAKDJASLKJNMdlkjflskdafmfoweruwqkn"));
    }
}