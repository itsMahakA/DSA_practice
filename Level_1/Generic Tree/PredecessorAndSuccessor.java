// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/pred-succ-generic-tree-official/ojquestion

 static Node predecessor;
  static Node successor;
  static int state = 0;
  public static void predecessorAndSuccessor(Node node, int data) {
    // write your code here
    if(state == 0){
        if(node.data == data){
            state++;
        }else{
            predecessor = node;
        }
        
    }else if(state == 1){
        successor = node;
        state++;
    }
    
    for(Node child : node.children){
        predecessorAndSuccessor(child,data);
    }
  }
