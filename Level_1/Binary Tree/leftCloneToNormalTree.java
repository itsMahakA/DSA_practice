// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/transform-to-normal-from-left-cloned-tree-official/ojquestion
public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node == null) return null;

    Node left = transBackFromLeftClonedTree(node.left.left);
    Node right = transBackFromLeftClonedTree(node.right);

    node.left = left;

    return node;

  }
