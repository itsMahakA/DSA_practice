// https://nados.io/question/size-sum-max-min-find-in-bst

 public static int max(Node node) {
    // write your code here
    if(node.right != null){
      return max(node.right);
    }else{
      return node.data;
    }
  }

  public static int min(Node node) {
    // write your code here
    if(node.left!= null){
      return min(node.left);
    }else{
      return node.data;
    }
  }
