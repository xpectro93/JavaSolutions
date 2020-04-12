// https://www.codewars.com/kata/5296455e4fe0cdf2e000059f/train/java
/*
Write a function called calculate that takes 3 values. The first and third values are numbers.
The second value is a character. If the character is "+" , "-", "*", or "/", 
the function will return the result of the corresponding mathematical function on the two numbers.
If the string is not one of the specified characters, the function should return null (throw an ArgumentException in C#).

calculate(2,"+", 4); //Should return 6
calculate(6,"-", 1.5); //Should return 4.5
calculate(-4,"*", 8); //Should return -32
calculate(49,"/", -7); //Should return -7
calculate(8,"m", 2); //Should return null
calculate(4,"/",0) //should return null

*/


public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo){
      Double Result = null;
      switch(operation) {
            case "+":
                Result = numberOne + numberTwo;
            break;
            case "-":
                Result = numberOne - numberTwo;
            break;
            case "*":
                if(numberTwo == 0 || numberOne == 0) return 0.0;
                Result = numberOne * numberTwo;
            break;
            case "/":
                if(numberTwo == 0) return Result;
                Result = numberOne / numberTwo;
            break;
            default:
                return Result;
      }
      return Result;
    }
    public static void main(String[] str){
       System.out.println( calculate(2,"+", 4));
       System.out.println(calculate(6,"-", 1.5));          
       System.out.println(calculate(-4,"*", 8));          
       System.out.println(calculate(49,"/", -7));         
       System.out.println( calculate(8,"m", 2));  
       System.out.println( calculate(4,"/",0)); 
    }
}