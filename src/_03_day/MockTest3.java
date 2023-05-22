package _03_day;

public class MockTest3 {

    static boolean isPalindrome(String str) {

        int n = str.length();
        for (int i = 0; i < n / 2; i++)
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        return true;
    }

    public static int palindromeIndex(String s) {  // ababab  aaab  bcbc  baa
        int start = 0;
        int end = s.length() - 1;

        if (isPalindrome(s))
            return -1;

        while (true) {

            if (start > end)
                break;

            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
                continue;
            }
            //
            if (isPalindrome(s.substring(0, start) + s.substring(start + 1))) {
                return start;
            } else if (isPalindrome(s.substring(0, end) + s.substring(end + 1))) {
                return end;
            } else
                return -1;
        }

        return -1;


        // Write your code here

    }
}
