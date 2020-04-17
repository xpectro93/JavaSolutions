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
    String chain = "";
    if(list == null)  return "null";
    Node current = list;
    while(current != null){
      chain += current.getData() + " -> ";
      current = current.getNext();
      
    }
    return chain + "null";
  }
}