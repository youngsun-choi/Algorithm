package programmers.level1.day05;

public class StringBasic {
    public static void main(String[] args) {
        String s = "-123"; //"a234" "1234" "-123"
        boolean answer = true;
        int sLength = s.length();

        if(sLength == 4 || sLength == 6) {
            for(int i=0; i<sLength; i++) {
                if(s.charAt(i) < 48 || s.charAt(i) > 57) {
                    answer = false;
                    break;
                }
            }
        }else {
            answer = false;
        }

        System.out.println(answer);
        System.out.println(solution("11123"));
    }

    public static boolean solution(String s) {
        int sLength = s.length();

        //다른풀이
        if(sLength == 4 || sLength == 6) {
            return s.matches("(^[0-9]*$)");
        }
        return false;

//        return (sLength != 4 && sLength != 6) ||
//                (s.split("[0-9]").length > 0) ? false : true;
    }
}
