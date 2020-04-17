// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f/train/java
// Given an integer width and a string ratio written as WIDTH:HEIGHT, output the screen dimensions as a string written as WIDTHxHEIGHT.
import java.util.*;
class ScreenSize {
    public static String findScreenHeight(int width, String ratio) {

        //split width on :
        String widthNHeight[] = ratio.split(":");

        //create new ArrayList
        List<String> dim = new ArrayList<String>(); 
        
        //fill ArrayList with Array
        dim = Arrays.asList(widthNHeight);

        //get width and height from arrays
        //doubles so we can get decimals later
        double w = Integer.parseInt(dim.get(0));
        double h = Integer.parseInt(dim.get(1));

        //get ratio
        double r = width / w;
        //use ratio to get height
        double x =  r * h;

        //output 
    	return width + "x" + (int) Math.floor(x);
    }
    public static void main(String[] str){
        System.out.println("Its working");
        //expected value;
        findScreenHeight(1415, "4:3");
    }
}