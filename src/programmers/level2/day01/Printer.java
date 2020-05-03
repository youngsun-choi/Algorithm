package programmers.level2.day01;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1}; //{2, 1, 3, 2} {1, 1, 9, 1, 1, 1}
        int location = 0; //2 0

        Printer printer = new Printer();
        System.out.println(printer.print(priorities, location));
    }
    public int print(int[] priorities, int location) {
        int pLength = priorities.length;
        int max = priorities[0] ;
        int answer = 0;

        for(int i=1; i<pLength; i++) {
            if(i != pLength-1) {
                max = (max < priorities[i]) ? priorities[i] : max;
            }
        }

        if(max > priorities[0]) {
            answer = (location == 0) ? pLength-1 : location-1;
        }else {
            answer = location;
        }
        return answer;
    }
}
