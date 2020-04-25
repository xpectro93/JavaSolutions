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
        // Gorillaz - Do Ya Thing (2010)
        String up  = "";
        String low = "";
        for(int i = 0; i < s.length(); i++){
          if(i % 2 == 0){
            up += Character.toUpperCase(s.charAt(i));
            low += Character.toLowerCase(s.charAt(i));
          }else{
            up +=  Character.toLowerCase(s.charAt(i));
            low += Character.toUpperCase(s.charAt(i));
          }
        
        }
        String[] out =  new String[2];
        out[0] = up;
        out[1] = low;
        return out;
    }
    public static void main(String[] str){
        System.out.println(Arrays.toString(capitalize("whydoyouhateme")));
        System.out.println(Arrays.toString(capitalize("wishyoucared")));
    }
    
}