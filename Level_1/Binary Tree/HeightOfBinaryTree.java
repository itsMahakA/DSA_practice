// question link - https://nados.io/question/size-sum-maximum-and-height-of-a-binary-tree

public static int height(Node node) {
    // write your code here
    if(node == null) return -1;

    return node==null ? -1 : Math.max(height(node.left),height(node.right)) + 1;  //plus 1 coz edge which connect node to its left/right;
  }
