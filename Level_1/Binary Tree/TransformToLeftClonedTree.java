// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/transform-to-left-cloned-tree-official/ojquestion

public static Node createLeftCloneTree(Node node){
    // write your code here
    if(node == null){
      return null;
    }

    Node left = createLeftCloneTree(node.left);
    Node right = createLeftCloneTree(node.right);

    Node newNode = new Node(node.data, left, null);
    node.left = newNode;

    return node;
  }
