package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeString {
    public static void main(String[] args) {
        String[] strings = {"sun","bed","car"}; //{"sun","bed","car"} {"abce","abcd","cdx"}
        int n = 1; //1 2
        String[] answer = arrange(strings, n);
        System.out.println(Arrays.toString(answer));
    }
    public static String[] arrange(String[] strings, int n) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num1 = s1.charAt(n);
                int num2 = s2.charAt(n);
                int result;

                if(num1 > num2) result = 1;
                else if(num1 < num2) result = -1;
                else result = 0;

                return result;
            }
        };

        Arrays.sort(strings);
        Arrays.sort(strings,comparator);
        return strings;

        //다른 풀이
//        int stringsLength = strings.length;
//        String[] array = new String[stringsLength];
//
//        for(int i=0; i<stringsLength; i++) {
//            array[i] = strings[i].charAt(n) + strings[i];
//        }
//
//        Arrays.sort(array);
//        String[] answer = new String[stringsLength];
//
//        for(int i=0; i<stringsLength; i++) {
//            answer[i] = array[i].substring(1);
//        }
//        return answer;
    }
}
