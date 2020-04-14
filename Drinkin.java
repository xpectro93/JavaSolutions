// https://www.codewars.com/kata/5aee86c5783bb432cd000018/train/java

/* 
Codewars Bar recommends you drink 1 glass of water per standard drink so you're not hungover tomorrow morning.

Your fellow coders have bought you several drinks tonight in the form of a string.
Return a string suggesting how many glasses of water you should drink to not be hungover.

Input => "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"
Output => "10 glasses of water"
*/

class Drinkin {
    //adding static makes it a regular function/ while not having static makes it a method to the class;
    public static String hydrate(String drinkString) {
        int drinks = 0;
        for(int i=0;i<drinkString.length();i++){
            boolean current = Character.isDigit(drinkString.charAt(i));

            if(current){
               int toNumber = Character.getNumericValue(drinkString.charAt(i));
                drinks +=toNumber;
            } 
            
        }
        if (drinks == 1) return  drinks + " glass of water";
        return  drinks+ " glasses of water";
    }
    public static void main(String[] str){
        String test = "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer";
        System.out.println(hydrate(test));
    };
}