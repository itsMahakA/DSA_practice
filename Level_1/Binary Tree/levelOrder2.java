// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/levelorder-binarytree-official/ojquestion
// approach 2 
// pq, RPA, but no cq, we will keep adding to pq only
// but how many times???
// keep a count var = pq.size();
// then loop count times for rpa method

  public static void levelOrder(Node node) {
    // write your code here
    ArrayDeque<Node> pq = new ArrayDeque<>();

    pq.add(node); //adding rootnode to pq

    while(pq.size()>0){
      int count = pq.size();

      for(int i = 0; i < count; i++){
        Node temp = pq.remove(); //remove
        System.out.print(temp.data + " "); //print

        //add to pq
        if(temp.left != null){
          pq.add(temp.left);
        }
        if(temp.right != null){
          pq.add(temp.right);
        }
      }
      
      System.out.println();
    }
  }
