
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
    
    int sum = 0;
    while(n >= 1){
       sum +=n;
       n = n / 2;
    }
    
        return sum;
    }
    public static void main(String[] str){
        System.out.println(halvingSum(25));
    }
  }