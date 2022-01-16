// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/mirror-generic-tree-official/ojquestion
public static void mirror(Node node){
    // write your code here
    for(Node child : node.children){
        mirror(child);
    }
    
    Collections.reverse(node.children);
  }
