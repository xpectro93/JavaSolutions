class StringLL {

      public static String stringify(Node list) {
      String chain = "";
      if(list == null)  return "null";
      Node current = list;
        System.out.println(list.getData());
      while(current != null){
        chain += current.getData() + " -> ";
        current = current.getNext();
        
      }
      return chain + "null";
  }
}