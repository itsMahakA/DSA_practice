// https://nados.io/question/size-sum-max-min-find-in-bst
public static int size(Node node) {
    // write your code here
    if(node == null) return 0;

    int lsize = size(node.left);
    int rsize = size(node.right);

    return lsize + rsize + 1;
  }
public static int sum(Node node) {
    // write your code here
    if(node == null) return 0;

    int lsum = sum(node.left);
    int rsum = sum(node.right);

    return lsum + rsum + node.data;
  }
