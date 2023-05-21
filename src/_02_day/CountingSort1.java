package _02_day;

import java.util.Arrays;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {

        Integer[] nums = new Integer[100];

        Arrays.fill(nums,new Integer(0));

        for(int i = 0; i < arr.size(); i++){
            nums[arr.get(i)]++;
        }

        return Arrays.asList(nums);
    }
}
