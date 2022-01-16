// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/generic-tree-traversal-official/ojquestion
 public static void traversals(Node node){
    // write your code here
    //node pre
    System.out.println("Node Pre " + node.data);
    
    //looop
    for(Node child : node.children){
        //edge pre
        System.out.println("Edge Pre "+ node.data + "--" + child.data);
        
        //call
        traversals(child);
        
        //edge post
        System.out.println("Edge Post " + node.data +"--" +child.data);
    }
    
    //node post
    System.out.println("Node Post " + node.data);
  }
