// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/are-trees-mirror-in-shape-official/ojquestion

 public static boolean areMirror(Node n1, Node n2) {
    // write your code here
    if(n1.children.size() != n2.children.size()){
        return false;
    }
    
    for(int i = 0; i < n1.children.size(); i++){
        Node c1 = n1.children.get(i); //from first
        Node c2 = n2.children.get(n2.children.size()-1-i); // from last
        
        if(areMirror(c1,c2) == false)
            return false;
        
    }
    return true;
  }
