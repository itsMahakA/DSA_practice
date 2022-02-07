// https://nados.io/question/replace-with-sum-of-larger
static int sum = 0;
public static void rwsol(Node node){
  // write your code here
  if(node == null) return;
  rwsol(node.right);
  //code
  int osum = sum;
  sum += node.data;
  node.data = osum;

  rwsol(node.left);
}
