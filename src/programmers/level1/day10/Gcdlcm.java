package programmers.level1.day10;

import java.util.ArrayList;
import java.util.Arrays;

public class Gcdlcm {
    public static void main(String[] args) {
        int n = 12;
        int m = 12;
        int[] answer = {};

        Gcdlcm gcdlcm = new Gcdlcm();
        System.out.println(Arrays.toString(gcdlcm.divisor(n,m,answer)));
        System.out.println(Arrays.toString(gcdlcm.divisor2(n,m,answer)));
    }
    public int[] divisor(int n, int m, int[] answer) {
        int max = (n>m) ? n : m;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=2; i<=max; i++) {
            if(n%i==0 && m%i==0) {
                arrayList.add(i);
            }
        }

        int arrayListSize = arrayList.size();

        if(arrayListSize == 0) {
            answer = new int[]{1,n*m};
        }else {
            int num = arrayList.get(arrayListSize-1);
            answer = new int[]{num,n*m/num};
        }
        return answer;
    }
    public int[] divisor2(int n, int m, int[] answer) {
        answer = new int[]{gcd(n,m), n*m/gcd(n,m)};
        return answer;
    }
    public int gcd(int n, int m) {
        if(m == 0) return n;
        return gcd(m,n%m);
    }
}
