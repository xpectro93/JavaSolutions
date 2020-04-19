/* 
https://www.codewars.com/kata/56b7f2f3f18876033f000307/train/java

In this Kata, your function receives an array of integers as input. Your task is to determine whether the numbers are in ascending order.
 An array is said to be in ascending order if there are no two adjacent integers where the left integer exceeds the right integer in value.

For the purposes of this Kata, you may assume that all inputs are valid, i.e. non-empty arrays containing only integers.

Note that an array of 1 integer is automatically considered to be sorted in ascending order since all (zero) adjacent pairs of integers satisfy the condition -
that the left integer does not exceed the right integer in value. An empty list is considered a degenerate case and therefore will not be tested in this Kata - 
feel free to raise an Issue if you see such a list being tested.

For example:

isAscOrder(new int[]{1,2,4,7,19}) == true
isAscOrder(new int[]{1,2,3,4,5}) == true
isAscOrder(new int[]{1,6,10,18,2,4,20}) == false
isAscOrder(new int[]{9,8,7,6,5,4,3,2,1}) == false // numbers are in DESCENDING order


*/

public class AreNumsInOrder {

    public static boolean isAscOrder(int[] arr) {
        //if there are is less than 2 elements return true;
        if(arr.length < 2) return true;

          for(int i= 0; i < arr.length - 1; i++){
           //check if element proceeding current element is less, and if it is, return false;
           if(arr[i] > arr[i + 1]) return false;
          }
        
        // if at we loop through the whole array without hitting the if statement return true;

        return true;
      }
      public static void main(String[] str){
        int[] arrarr = new int[] {2,1};
        int[] arrr = new int[] {1,2};
         
        System.out.println(isAscOrder(arrarr));
        System.out.println(isAscOrder(arrr));
      }
  
  }