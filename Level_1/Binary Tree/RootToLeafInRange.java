// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/binary-tree-path-to-leaves-from-root-official/ojquestion
 public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
    // write your code here
    if(node == null) return;

    if(node.left == null && node.right == null){
      sum += node.data;
      if(sum >= lo && sum <= hi){
        System.out.println(path + node.data);
      }
      return;
    }

