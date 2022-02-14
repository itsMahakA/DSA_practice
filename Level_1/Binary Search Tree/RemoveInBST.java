// https://nados.io/question/remove-node-from-bst
public static int max(Node node){
    if(node.right != null){ //coz max toh right me hi hoga n
      return max(node.right);
    }else{
      return node.data;
    }
  }

  public static Node remove(Node node, int data) {
    // write your code here
    if(node == null) {
      return null;
    }

    if(data < node.data){ //go left side
      node.left = remove(node.left, data);
      return node;

    }else if(data > node.data){ //go right side
      node.right = remove(node.right, data);
      return node;

    }else{ // data found
      //case 1 
      if(node.right != null && node.left != null){
        int leftMax = max(node.left);
        node.data = leftMax;

        //since this max will 2 times 
        node.left = remove(node.left, leftMax);
        return node;
      }
      else if(node.right != null ){
        return node.right;

      }
      else if(node.left != null){
        return node.left;

      }
      else{ 
        return null;

      }

    }
  }
