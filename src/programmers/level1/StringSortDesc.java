package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class StringSortDesc {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";
        int sLength = s.length();
        Character[] chars = new Character[sLength];

        for(int i=0; i<sLength; i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars, Collections.reverseOrder());
        for(char data:chars) {
            answer += data;
        }
        System.out.println(answer);

        //다른풀이
//        char[] chars = s.toCharArray();
//        answer = new StringBuilder(new String(chars)).reverse().toString();
//        System.out.println(answer);
    }
}
