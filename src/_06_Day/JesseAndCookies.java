package _06_Day;

import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {

    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        int count = 0;
        PriorityQueue<Integer> he = new PriorityQueue<Integer>(A.size());

        for(int i = 0; i < A.size(); i++){
            int sweetness = A.get(i);
            he.add(sweetness);
        }
        while(he.peek() < k && he.size() > 1){
            int ne = he.poll() + 2*he.poll();
            he.add(ne);
            count++;
        }
        if(he.peek() >= k){
            return count;
        } else{
            return -1;
        }

    }
}
