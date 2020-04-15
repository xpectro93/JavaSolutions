// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f/train/java
// Given an integer width and a string ratio written as WIDTH:HEIGHT, output the screen dimensions as a string written as WIDTHxHEIGHT.
import java.util.*;
class Kata {
    public static String findScreenHeight(int width, String ratio) {
        String widthNHeight[] = ratio.split(":");
	    List<String> dim = new ArrayList<String>(); 
        dim = Arrays.asList(widthNHeight);
        double w = Integer.parseInt(dim.get(0));
        double h = Integer.parseInt(dim.get(1));
        System.out.println(width / w);
        double r = width / w;
        double x =  r * h;
    	return width + "x" + Math.round(x);
    }
    public static void main(String[] str){
        System.out.println("Its working");
        //expected value;
        findScreenHeight(1415, "4:3");
    }
}