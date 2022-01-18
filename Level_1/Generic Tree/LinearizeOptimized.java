public static Node linearize(Node node){
    // write your code here
    if(node.children.size() == 0)
        {return node;}

    Node lastchild = node.children.get(node.children.size()-1);
    Node lastTail = linearize(lastchild);
    
    while(node.children.size() > 1){
        Node slastchild = node.children.get(node.children.size()-2);
        Node slastTail = linearize(slastchild);
        
        slastTail.children.add(lastchild);
        node.children.remove(node.children.size()-1);
        lastchild = slastchild;
    }
    return lastTail;
  }
