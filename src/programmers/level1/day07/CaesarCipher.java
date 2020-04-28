package programmers.level1.day07;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;

        System.out.println(cipher(s,n));
    }
    public static String cipher(String s, int n){
        StringBuffer stringBuffer = new StringBuffer();
        char c = ' ';
        char result = ' ';

        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if(Character.isLowerCase(c)) {
                result = (char)(((c+n)>'z') ? c+n-'z'+'a'-1 : c+n);
            }else if(Character.isUpperCase(c)) {
                result = (char)(((c+n)>'Z') ? c+n-'Z'+'A'-1 : c+n);
            }else {
                result = ' ';
            }
            stringBuffer.append(result);
        }
        return stringBuffer.toString();
    }
}
