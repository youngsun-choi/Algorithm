package programmers.level1;

public class DivisorSum {
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += (n % i == 0) ? i: 0;
        }
        System.out.println(sum);

        //다른풀이
//        for(int i=1; i<=n/2; i++) {
//            sum += (n % i == 0) ? i: 0;
//        }
//        System.out.println(sum+n);
    }
}
