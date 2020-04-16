
/* 
https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d/train/java
Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47
*/
public class HalvingSum {
    public static int halvingSum(int n) {
    
    //var to store results
    int sum = 0;
    //while loop that will stop once our number reacher 1 or less than 1;
    while(n >= 1){
       // we add the number to the sum;
       sum +=n;
       //divide number for next iteration;
       n = n / 2;
    }
        //return result
        return sum;
    }
    public static void main(String[] str){
        System.out.println(halvingSum(25));
    }
  }