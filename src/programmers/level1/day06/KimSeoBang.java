package programmers.level1.day06;

import java.util.Arrays;

public class KimSeoBang {
    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};

        System.out.println(findKim(seoul));
        System.out.println(findKim1(seoul));
    }

    public static String findKim(String[] seoul) {
        int i;
        for(i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) break; //seoul[i].indexOf("Kim") == 0
        }
        return "김서방은 "+i+"에 있다";
    }

    //다른풀이
    public static String findKim1(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+x+"에 있다";
    }
}
