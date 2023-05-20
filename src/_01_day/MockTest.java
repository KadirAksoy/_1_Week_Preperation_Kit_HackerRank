package _01_day;

import java.util.Collections;
import java.util.List;

public class MockTest {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);

        int n = arr.size() / 2;
        return arr.get(n);


        // Write your code here

    }

}
