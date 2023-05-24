package _04_day;

import java.util.List;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        int count = 0;
        boolean flag = false;

        for(int i = q.size(); i >= 1; --i){
            if(q.get(i - 1) != i){
                if((i - 2) >= 0 && q.get(i - 2) == i){
                    int swap1 = q.get(i - 1);
                    int swap2 = q.get(i - 2);
                    q.set(i - 1, swap2);
                    q.set(i - 2, swap1);
                    count++;
                }else if((i - 3) >= 0 && q.get(i - 3) == i) {
                    int swap1 = q.get(i - 1);
                    int swap2 = q.get(i - 2);
                    int swap3 = q.get(i - 3);
                    q.set(i - 1, swap3);
                    q.set(i - 2, swap1);
                    q.set(i - 3, swap2);
                    count += 2;
                }else{
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag ? "Too chaotic" : count);



    }
}
