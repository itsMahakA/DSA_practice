// question link = https://nados.io/question/size-sum-maximum-and-height-of-a-binary-tree

public static int sum(Node node) {
    // write your code here
    if(node == null){
      return 0;
    }

    int lsum = sum(node.left);
    int rsum = sum(node.right);

    return lsum + rsum + node.data;
  }
