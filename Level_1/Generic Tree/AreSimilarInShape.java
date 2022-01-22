// question link- https://www.pepcoding.com/resources/online-java-foundation/generic-tree/are-generic-trees-similar-official/ojquestion

public static boolean areSimilar(Node n1, Node n2) {
    // write your code here
    if(n1.children.size() != n2.children.size()){
        return false;
    }
    
    for(int i = 0; i < n1.children.size(); i++){
        Node child1 = n1.children.get(i);
        Node child2 = n2.children.get(i);
        
        if(areSimilar(child1, child2) == false){
            return false;
        }
    }
    return true;
  }
