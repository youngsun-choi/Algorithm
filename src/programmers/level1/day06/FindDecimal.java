package programmers.level1.day06;

import java.util.Arrays;

public class FindDecimal {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(findDecimal(n));
    }
    public static int findDecimal(int n) {
        int count = 0;
        int[] num = new int[n+1];

        for(int i=2; i<=n; i++) {
            num[i] = i;
        }
        System.out.println(Arrays.toString(num));

        for(int i=2; i<=n; i++) {
            if(num[i] == 0) continue;
            for(int j=2*i; j<=n; j+=i) {
                num[j] = 0;
            }
        }

        for(int data:num){
            if(data != 0){
                count++;
            }
        }

        return count;
    }

    //다른 풀이
    public static int findDecimal2(int n) {
        int count = 0;
        for(int i=2; i<=n; i++) {
            int j = 2;
            int cnt = 0;
            while(j <= (int)Math.sqrt(i)) {
                if(i % j == 0) {
                    cnt += 1;
                    break;
                }
                j += 1;
            }
            if(cnt == 0) count += 1;
        }
        return count;
    }
}
