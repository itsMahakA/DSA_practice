// question link : https://nados.io/question/size-sum-maximum-and-height-of-a-binary-tree

 public static int size(Node node) {
    // write your code here
    if(node == null){
      return 0;
    }

    int lsize = size(node.left); //get size of left tree
    int rsize = size(node.right); //get size of right tree
    return lsize + rsize + 1; //1 coz node itself
  }
