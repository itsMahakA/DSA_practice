// pre order
public static void preOrder(Node node){
    if(node == null){
      return;
    }

    System.out.println(node.data);
    preOrder(node.left);
    preOrder(node.right);
  }
public static void InOrder(Node node){
    if(node == null){
      return;
    }
    preOrder(node.left);
    System.out.println(node.data);
    preOrder(node.right);
  }
public static void postOrder(Node node){
    if(node == null){
      return;
    }
    preOrder(node.left);
    preOrder(node.right);
    System.out.println(node.data);
  }
  
