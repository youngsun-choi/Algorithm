package programmers.level1.day14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Stocks {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Stocks stocks = new Stocks();
        System.out.println(Arrays.toString(stocks.stock(prices)));
    }
    public int[] stock(int[] prices) {
        int pricesLength = prices.length;
        int[] answer = new int[pricesLength];
        Stack<Integer> stack = new Stack<>();
        int cnt = 0, pop;
        Iterator value;

        for(int i=pricesLength-1; i>=0; i--) {
            stack.push(prices[i]);
        }

        for(int i=0; i<pricesLength; i++) {
            cnt = 0;
            pop = stack.pop();
            value = stack.iterator();
            while(value.hasNext()) {
                if((int)value.next() >= pop) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
