// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/max-generic-tree-official/ojquestion
public static int max(Node node) {
    // write your code here
    int maxChild = node.data;
    for(Node child : node.children){
        int temp = max(child);
        maxChild = Math.max(temp,maxChild);
    }
    return maxChild;
  }
