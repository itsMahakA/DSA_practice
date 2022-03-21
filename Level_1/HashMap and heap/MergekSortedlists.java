public class Pair implements Comparable{
      int data;
      int di; //data idx
      int li; //list idx

      public int compareTo(Pair o){
         return this.data - o.data;
      }

   }

   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
      PriorityQueue<Pair> pq = new PriorityQueue<>();

      for(int li = 0;li< lists.size();li++){
         Pair p = new Pair();
         p.li = li;
         p.di = 0;
         p.data = lists.get(li).get(o);
         pq.add(p);

      }

      while(pq.size() > 0){
         Pair removedPair = pq.peek();
         pq.remove();
         rv.add(removedPair.data);

         removedPair.di++;

         if(removedPair.di < lists.get(removedPair.li).size()){
            removedPair.data = lists.get(removedPair.li).get(removedPair.di);
            pq.add(removedPair);
         }
      }
      


      return rv;
   }
