/**
 * https://www.codewars.com/kata/59cfc000aeb2844d16000075
 * 
 *
 *Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
 * 
 */
import java.util.Arrays;
class AltCap{
     public static String[] capitalize(String s){
        // create two strings
        String up  = "";
        String low = "";
        for(int i = 0; i < s.length(); i++){
          if(i % 2 == 0){
            //evens where uppercase and lower
            up += Character.toUpperCase(s.charAt(i));
            low += Character.toLowerCase(s.charAt(i));
          }else{
            //got odd indexes 
            up +=  Character.toLowerCase(s.charAt(i));
            low += Character.toUpperCase(s.charAt(i));
          }
        
        }
        //create Array with the length of 2 for the up and low; inserted to new Array
        String[] out =  new String[2];
        out[0] = up;
        out[1] = low;
        //return answer;
        return out;
    }
    public static void main(String[] str){
        System.out.println(Arrays.toString(capitalize("whydoyouhateme")));
        System.out.println(Arrays.toString(capitalize("wishyoucared")));
    }
    
}