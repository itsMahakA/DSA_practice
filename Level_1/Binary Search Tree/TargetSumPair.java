// https://nados.io/question/target-sum-pair-in-bst
public static boolean find(Node node, int tar){
  if(node == null) return false;

  if(node.data > tar){
    return find(node.left, tar);
  }else if(node.data < tar){
    return find(node.right, tar);
  }else{
    return true;
  }

}
public static void targetSumPair(Node root, Node node, int tar){
  if(node == null) return;

  targetSumPair(root, node.left, tar);
  //code
  int two = tar - node.data;
  if(node.data < two){
    if(find(root,two)){
      System.out.println(node.data + " " + two);
    }
  }
  targetSumPair(root,node.right,tar);
}

