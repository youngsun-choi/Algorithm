package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        long n = 12345;
        ReverseArray reverseArray = new ReverseArray();
        System.out.println(Arrays.toString(reverseArray.reverse(n)));
    }
    public int[] reverse(long n) {
        ArrayList<Long> arrayList = new ArrayList<>();
        while (true) {
            arrayList.add(n%10);
            if(n<10) break;
            n /= 10;
        }
        int arrayListSize = arrayList.size();
        int[] answer = new int[arrayListSize];
        for(int i=0; i<arrayListSize; i++) {
            answer[i] = arrayList.get(i).intValue();
        }
        return answer;
    }
    //다른풀이
    public int[] reverse2(long n) {
        String str = "" + n;
        int[] answer = new int[str.length()];
        int cnt = 0;

        while(n>0) {
            answer[cnt] = (int)(n%10);
            n/=10;
            cnt++;
        }
        return answer;
    }
}
