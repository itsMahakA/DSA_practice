// https://nados.io/question/size-sum-max-min-find-in-bst
 public static boolean find(Node node, int tar){
    // write your code here
    if(node == null) return false;

    if(tar > node.data) return find(node.right, tar);
    else if(tar < node.data) return find(node.left, tar);
    else return true;
  }  
