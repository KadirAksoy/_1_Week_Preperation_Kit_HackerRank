package _03_day;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        String result = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                result += (char)(((int)ch + k - 65) %26 + 65);
            }
            else if(Character.isLowerCase(ch)){
                result += (char)(((int)ch + k - 97) %26 + 97);
            }
            else{
                result += ch;
            }
        }
        return result;

    }

}
