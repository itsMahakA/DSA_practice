static class Tpair{
    int sum = 0;
    int tiltsum = 0;
  }
  public static Tpair tilt(Node node){
    if(node == null){
      Tpair base = new Tpair();
      base.sum = 0;
      base.tiltsum = 0;
      return base;
    }

    Tpair lp = tilt(node.left);
    Tpair rp = tilt(node.right);

    int nodetilt = Math.abs(lp.sum - rp.sum);

    Tpair result = new Tpair();
    result.sum = lp.sum + rp.sum + node.data;
    result.tiltsum = lp.tiltsum + rp.tiltsum + nodetilt;

    return result; 

  }
