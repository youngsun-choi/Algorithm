package programmers.level1.day06;

public class SuBak {
    public static void main(String[] args) {
        int n = 4;
        String answer = "";

        for(int i=1; i<=n; i++) {
            answer += (i % 2 == 0) ? "박" : "수";
        }

        System.out.println(answer);
        System.out.println(subak1(n));
        System.out.println(subak2(n));
    }
    //다른풀이
    public static String subak1(int n) {
        return new String(new char[n/2+1]).replace("\0","수박").substring(0,n);
    }
    public static String subak2(int n) {
        StringBuffer sf = new StringBuffer();
        for(int i=1; i<=n; i++) {
            sf.append((i%2==0)?"박":"수");
        }
        return sf.toString();
    }
}
