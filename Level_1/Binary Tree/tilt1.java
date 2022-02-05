// https://nados.io/question/tilt-of-binary-tree

  static int tilt = 0;
  public static int tilt(Node node){
    // write your code here to set the tilt data member
  if(node==null){
    return 0;
  }

    int lsum = tilt(node.left);
    int rsum = tilt(node.right);

    int ntilt = Math.abs(lsum - rsum);
    tilt += ntilt;

    int totalsum = lsum + rsum + node.data;

    return totalsum;


  }
