// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/find-nodetorootpath-binary-tree-official/ojquestion

public static boolean find(Node node, int data){
    // write your code here
    if(node == null) return false;

    if(node.data == data){
      return true;
    }

    boolean lans = find(node.left, data);
    if(lans == true) return true;

    boolean rans = find(node.right, data);
    if(rans == true) return true;

    return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
     if(node == null) return new ArrayList<>();

    if(node.data == data){
      ArrayList<Integer> list = new ArrayList<>();
      list.add(node.data);
      return list;
    }

    ArrayList<Integer> lans = nodeToRootPath(node.left, data);
    if(lans.size() > 0) {
      lans.add(node.data);
      return lans;
    }
    ArrayList<Integer> rans= nodeToRootPath(node.right, data);
    if(rans.size() > 0) {
      rans.add(node.data);
      return rans;
    }

    return new ArrayList<>();
  }
