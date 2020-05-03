package programmers.level2.day01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Stocks {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Stocks stocks = new Stocks();
        System.out.println(Arrays.toString(stocks.stock(prices)));
        System.out.println(Arrays.toString(stocks.stock2(prices)));
    }
    public int[] stock(int[] prices) {
        int pricesLength = prices.length;
        int[] answer = new int[pricesLength];
        Stack<Integer> stack = new Stack<>();
        int top;

        for(int i=0; i<pricesLength; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }

        while(!stack.empty()) {
            top = stack.pop();
            answer[top] = pricesLength - 1 - top;
        }
        return answer;
    }
    public int[] stock2(int[] prices) {
        int pricesLength = prices.length;
        int[] answer = new int[pricesLength];
        int answerLength = answer.length;

        for(int i=0; i<answerLength; i++) {
            for(int j=i+1; j<answerLength; j++) {
                if(prices[i] >prices[j]) {
                    answer[i] = j-i;
                    break;
                }
                if(j == answerLength-1) answer[i] = j-i;
            }
        }
        return  answer;
    }
}
