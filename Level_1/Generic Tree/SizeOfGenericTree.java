// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/size-generic-tree-official/ojquestion

  public static int size(Node node){
    // write your code here
    int size = 0;
    for(Node child : node.children){
        size += size(child);  //recursive call
        
    }
    return size + 1;
    
  }

  
