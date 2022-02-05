// https://nados.io/question/is-balanced-tree
static boolean treeBal = true;
  public static int isBalanced(Node node){
    // write your code here
    if(node == null) return -1;


    int lh = isBalanced(node.left);
    int rh = isBalanced(node.right);

    int h = Math.max(lh,rh)  + 1;
    boolean nodeBal = Math.abs(lh - rh) <= 1;
    if(nodeBal == false){
      treeBal = false;
    }

    return h;

  }
