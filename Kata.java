// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f/train/java
// Given an integer width and a string ratio written as WIDTH:HEIGHT, output the screen dimensions as a string written as WIDTHxHEIGHT.
import java.util.*;
class Kata {
    public static String findScreenHeight(int width, String ratio) {
        String dimensions;
        String widthNHeight[] = ratio.split(":");
	    List<String> dim = new ArrayList<String>(); 
        dim = Arrays.asList(widthNHeight);
        int w = Integer.parseInt(dim.get(0));
        int h = Integer.parseInt(dim.get(1));
        double r = width / w;
        System.out.print(r *  h);
    	return "dimensions";
    }
    public static void main(String[] str){
        System.out.println("Its working");

        //expected value;
        findScreenHeight(1024, "4:3");
    }
}