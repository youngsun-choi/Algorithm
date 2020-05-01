package programmers.level1.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Budget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4}; //{2,2,3,3} {1,3,2,5,4}
        int budget = 9; //10 9

        Budget bd = new Budget();
        System.out.println(bd.calculate(d, budget));
    }
    public int calculate(int[] d, int budget) {
        Arrays.sort(d);
        int i;
        for(i=0; i<d.length; i++) {
            if(budget == 0 || budget < d[i]) break;
            budget -= d[i];
        }
        return i;
    }
}
