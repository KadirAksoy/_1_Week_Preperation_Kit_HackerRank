package _02_day;
import java.util.*;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {

        HashMap<Integer,Integer> numMap = new HashMap<>();

        for(int num : a){
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        for (int num : a) {
            if (numMap.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
}
