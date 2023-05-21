package _02_day;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int first = 0, second = 0, n = arr.size();

        for(int i = 0; i < n; i++){
            first += arr.get(i).get(i);
            second += arr.get(i).get(n - 1 - i);
        }

        if(first > second) return first - second;

        return second - first;
    }
}
