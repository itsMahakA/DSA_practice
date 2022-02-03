// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/remove-leaves-binary-tree-official/ojquestion
public static Node removeLeaves(Node node){
    // write your code here
    if(node == null){
      return null;
    }

    if(node.left == null && node.right == null){
      return null;
    }

    node.left = removeLeaves(node.left);
    node.right = removeLeaves(node.right);

    return node;
  }
