package programmers.level2.day05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Top {
    public static void main(String[] args) {
        int[] heights = {1,5,3,6,7,6,5}; //{6,9,5,7,4} {3,9,9,3,5,7,2} {1,5,3,6,7,6,5}
                                     //{0,0,2,2,4} {0,0,0,3,3,3,6} {0,0,2,0,0,5,6}
        Top top = new Top();
        System.out.println(Arrays.toString(top.top(heights)));
        System.out.println(Arrays.toString(top.top2(heights)));
        System.out.println(Arrays.toString(top.top3(heights)));
}
    public int[] top(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int heightsLength = heights.length;
        int[] hIndex = new int[heightsLength];
        int[] answer = new int[heightsLength];

        for(int i=1; i<=heightsLength; i++) {
            hIndex[i-1] = i;
        }

        for(int i=heightsLength-1; i>=0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(heights[i]-heights[j] < 0) {
                    stack.push(hIndex[j]);
                    break;
                }else if(j == 0){
                    stack.push(0);
                }
            }
        }

        while(stack.size() != heightsLength) {
            stack.push(0);
        }

        for(int i=0; i<heightsLength; i++) {
            answer[i] = stack.pop();
        }

        return answer;
    }
    class Tower {
        int index;
        int height;

        public Tower(int index, int height) {
            this.index = index;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Tower{" + "index=" + index + ", height=" + height + '}';
        }
    }
    public int[] top2(int[] heights) {
        Stack<Tower> stack = new Stack<>();
        int heightsLength = heights.length;
        int[] answer = new int[heightsLength];
        int receiveIndex;

        for(int i=0; i<heightsLength; i++) {
            Tower tower = new Tower(i+1, heights[i]);
            receiveIndex = 0;

            while (!stack.isEmpty()) {
                Tower top = stack.peek();

                if (top.height > tower.height) {
                    receiveIndex = top.index;
                    break;
                }

                stack.pop();
            }

            stack.push(tower);
            answer[i] = receiveIndex;
        }
        return answer;
    }
    public int[] top3(int[] heights) {
        int heightsLength = heights.length;
        int[] answer = new int[heightsLength];

        for(int i=0; i<heightsLength; i++) {
            for(int j=i+1; j<heightsLength; j++) {
                if(heights[i] > heights[j]) {
                    answer[j] = i+1;
                }
            }
        }

        return answer;
    }
}
