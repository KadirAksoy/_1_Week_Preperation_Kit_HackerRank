package _04_day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public static String sort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);

    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < grid.size(); i++){
            String str = sort(grid.get(i));
            list.add(str);
        }

        int size = list.get(0).length();

        for(int i = 1; i < list.size(); i++){
            for(int j = 0; j < size; j++){
                if(list.get(i - 1).charAt(j) > list.get(i).charAt(j)){
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
