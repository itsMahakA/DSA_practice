// question link - https://nados.io/question/size-sum-maximum-and-height-of-a-binary-tree

public static int max(Node node) {
    // write your code here
    if(node == null){
      return Integer.MIN_VALUE;
    }

    int lmax = max(node.left);
    int rmax = max(node.right);

    return Math.max(node.data, Math.max(lmax,rmax));
  }
