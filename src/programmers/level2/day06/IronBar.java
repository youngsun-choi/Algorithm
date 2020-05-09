package programmers.level2.day06;

import java.util.Arrays;
import java.util.Stack;

public class IronBar {
    public static void main(String[] args) {
        String arrangement = "()(((()())(())()))(())";
        IronBar ironBar = new IronBar();

        System.out.println(ironBar.iron(arrangement));
    }
    //다른사람풀이
    public int iron(String arrangement) {
        int answer = 0;
        String[] array = arrangement.replace("()","1").split("");
        Stack<String> stack = new Stack<>();
        System.out.println(Arrays.toString(array));

        for(int i=0; i<array.length; i++) {
            if(array[i].equals("(")) {
                stack.push(array[i]);
            }else if(array[i].equals("1")) {
                answer += stack.size();
            }else {
                stack.pop();
                answer++;
            }
        }

        return answer;
    }
}
