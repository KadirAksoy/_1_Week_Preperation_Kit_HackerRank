package _01_day;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        double pNumbers = 0;
        double nNumbers = 0;
        double zNumbers = 0;

        int arrLength = arr.size();

        for (int i = 0; i < arrLength; i++) {
            if (arr.get(i) > 0) {
                pNumbers++;
            } else if (arr.get(i) < 0) {
                nNumbers++;
            } else {
                zNumbers++;
            }
        }
        System.out.println(pNumbers / arrLength);
        System.out.println(nNumbers / arrLength);
        System.out.println(zNumbers / arrLength);
    }
}
