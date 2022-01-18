// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/find-in-tree-official/ojquestion
public static boolean find(Node node, int data) {
    // write your code here
    if(node.data == data){
        return true;
    }
    
    for(Node child: node.children){
        if(find(child,data) == true){
            return true;
        }
    }
    
    return false;
  }
