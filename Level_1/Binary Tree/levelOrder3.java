// Delimiter method
// question link - https://www.pepcoding.com/resources/online-java-foundation/binary-tree/levelorder-binarytree-official/ojquestion
//adding rootnode to pq
//make delim
//add delim
//remove
//check if it is delim - if yes! then just println, add delim at end of queue, continue
//print temp
//add children to pq
  public static void levelOrder(Node node) {
    // write your code here
    ArrayDeque<Node> pq = new ArrayDeque<>();

    pq.add(node); //adding rootnode to pq

    Node delim = new Node(-1,null,null); //make delim
    pq.add(delim); //add delim

    while(pq.size()>0){
      
      Node temp = pq.remove(); //remove

      //check if it is delim 
      if(temp.data == -1){
        System.out.println();
        if(pq.size() > 0){
          pq.add(temp);
        }
        continue;
      }
      System.out.print(temp.data + " "); //print

      //add to pq
      if(temp.left != null){
        pq.add(temp.left);
      }
      if(temp.right != null){
        pq.add(temp.right);
      }
    }
  }
