// https://nados.io/question/add-node-to-bst
public static Node add(Node node, int data) {
    // write your code here
    if(node == null){
      Node newNode = new Node(data,null,null);
      return newNode;
    }

    if(data > node.data){
      node.right = add(node.right, data);
    }else if(data < node.data){
      node.left = add(node.left, data);
    }
    return node;
  }
