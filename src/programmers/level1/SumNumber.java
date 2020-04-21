package programmers.level1;

public class SumNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        long sum = 0;
        for(int i=Math.min(a,b); i<=Math.max(a,b); i++) {
            sum += i;
        }
        //다른사람풀이
        for(int i=(a>b) ? b : a; i<=((a>b) ? a : b); i++) {
            sum += i;
        }
        sum(Math.min(a,b), Math.max(a,b));
        System.out.println(sum);
    }

    public static long sum(int a, int b) {
        return (b-a+1)*(a+b)/2;
    }
}
