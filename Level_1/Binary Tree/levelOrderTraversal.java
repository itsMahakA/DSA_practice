// question link - https://www.pepcoding.com/resources/online-java-foundation/binary-tree/levelorder-binarytree-official/ojquestion

 public static void levelOrder(Node node) {
    // write your code here
    ArrayDeque<Node> pq = new ArrayDeque<>();
    ArrayDeque<Node> cq = new ArrayDeque<>();

    pq.add(node); //adding rootnode to pq

    while(pq.size()>0){
      Node temp = pq.remove(); //remove
      System.out.print(temp + " "); //print

      //add to cq
      if(temp.left != null){
        cq.add(temp.left);
      }
      if(temp.right != null){
        cq.add(temp.right);
      }

      //if pq == null
      if(pq.size() == 0){
        pq = cq;
        cq = new ArrayDeque<>();
        System.out.println();
      }


    }
  }
