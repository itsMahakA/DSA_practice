// question link - https://www.pepcoding.com/resources/online-java-foundation/generic-tree/height-of-generic-tree-official/ojquestion

public static int height(Node node) {
    // write your code here
    int maxh = -1; //coz agar ek hi child h then h = 0;
    for(Node child: node.children){
        int temp = height(child);
        maxh = Math.max(temp,maxh);
    }
    return maxh + 1;
    
  }
