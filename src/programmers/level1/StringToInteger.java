package programmers.level1;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "-1234";
        int answer = Integer.parseInt(s);
        System.out.println(answer);
        System.out.println(strToInt(s));
    }
    //다른풀이
    public static int strToInt(String s) {
        boolean sign = true;
        int answer = 0;
        char c;
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if(c == '-') {
                sign = false;
            }else if(c != '+')
            answer = answer * 10 + (c - '0');
        }
        return answer * (sign ? 1 : -1);
    }
}
