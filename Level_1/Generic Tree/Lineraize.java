//questionlink - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/linearize-generic-tree-official/ojquestion
//O(n2)
public static Node getTail(Node node){
      while(node.children.size() >0){
          node = node.children.get(0);
      }
      
      return node;
  }
  public static void linearize(Node node){
    // write your code here
    for(Node child : node.children){
        linearize(child);
    }
    while(node.children.size()>1){
        Node last = node.children.remove(node.children.size() - 1);
        Node slast = node.children.get(node.children.size()-1);
        Node slastTail = getTail(slast);
        slastTail.children.add(last);
    }
    
  }
