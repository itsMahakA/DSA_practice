//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/print-single-child-nodes-official/ojquestion
public static void printSingleChildNodes(Node node, Node parent){
    // write your code here
    if(node == null){
      return;
    }

    if(parent != null){
      if(parent.left == null && parent.right == node){
        System.out.println(node.data);
      }else if(parent.left == node && parent.right == null){
        System.out.println(node.data);
      }
    }

    printSingleChildNodes(node.left, node);
    printSingleChildNodes(node.right, node);

  }
