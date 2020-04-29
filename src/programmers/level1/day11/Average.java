package programmers.level1.day11;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Average a = new Average();

        System.out.println(a.average(arr));
        System.out.println(a.average2(arr));
    }
    public double average(int[] arr){
        double sum = 0;
        for(int data:arr) {
            sum += data;
        }
        return sum/arr.length;
    }
    //다른풀이
    public double average2(int[] arr){
        return Arrays.stream(arr).average().orElse(0);
    }
}
