package programmers.level1.day13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        int n = 6;//5;
        int[] arr1 = {46, 33, 33 ,22, 31, 50}; //{9, 20, 28, 18, 11};
        int[] arr2 = {27 ,56, 19, 14, 14, 10}; //{30, 1, 21, 17, 28};

        SecretMap secretMap = new SecretMap();
        System.out.println(Arrays.toString(secretMap.map(n, arr1, arr2)));
    }
    public String[] map(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        String format = "%".concat(String.valueOf(n)).concat("s");

        for(int i=0; i<n; i++) {
            map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for(int i=0; i<n; i++) {
            map[i] = String.format(format, map[i]);
            map[i] = map[i].replace('0',' ');
            map[i] = map[i].replace('1','#');
        }
        return map;
    }
}
