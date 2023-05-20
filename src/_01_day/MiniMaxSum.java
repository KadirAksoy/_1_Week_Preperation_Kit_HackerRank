package _01_day;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {

        int sum = 0, min = arr.get(0), max = arr.get(0);

        for (int num : arr) {
            sum += num;
            if(num <= min){
                min = num;
            }
            if(num >= max){
                max = num;
            }
        }
        System.out.println((sum - max) + " " + (sum - min));


    }

}
