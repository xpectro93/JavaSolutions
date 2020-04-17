/*
https://www.codewars.com/kata/582c297e56373f0426000098/train/java
Although this Kata is not part of an official Series, you may also want to try out Parse a linked list from a string if you enjoyed this Kata.

Preloaded
Preloaded for you is a class, struct or derived data type Node (depending on the language) used to construct linked lists in this Kata:

class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
... its string representation would be:

"0 -> 1 -> 4 -> 9 -> 16 -> null"
*/
class StringLL {

  public static String stringify(Node list) {
    //add output string;
    String chain = "";

    //check if LL has a valid value, if it doesnt it returns a string of null;
    if(list == null)  return "null";

    //set variable to keep track of our current node, this will help us traverse through problem;
    Node current = list;
    
    //we loop thoough our LL until our current is null;
    while(current != null){

      //for every iteration of the LL we call on the Node's method to get our value;
      chain += current.getData() + " -> ";

      //after getting out number value we set of current node to be our next one;
      current = current.getNext();
      
    }

    //return output string;
    return chain + "null";
  }
}