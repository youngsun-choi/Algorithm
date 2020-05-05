package programmers.level2.day02;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1}; //{2, 1, 3, 2} {1, 1, 9, 1, 1, 1}
        int location = 0; //2 0

        Printer printer = new Printer();
        //System.out.println(printer.print(priorities, location));
        System.out.println(printer.print2(priorities, location));
        //System.out.println(printer.print3(priorities, location));
    }
    public int print(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue pQueue = new PriorityQueue(Collections.reverseOrder());

        for(int data:priorities) {
            pQueue.add(data);
        }
        System.out.println(Arrays.toString(priorities));
        System.out.println(pQueue);

        while (!pQueue.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                System.out.println(priorities[i]+","+pQueue.peek());
                if(priorities[i] == (int)pQueue.peek()) {
                    System.out.println(i+", "+location);
                    if(i == location) {
                        return answer;
                    }
                    pQueue.poll();
                    System.out.println(pQueue);
                    answer++;
                }
            }
        }
        return  answer;
    }
    public int print2(int[] priorities, int location) {
        int answer = 0;
        int current;

        Queue<Integer> queue = new LinkedList<>();

        for(int data:priorities) {
            queue.add(data);
        }

        Arrays.sort(priorities);
        int length = priorities.length-1;

        while(!queue.isEmpty()) {
            current = queue.poll();
            if(current == priorities[length-answer]) {
                answer++;
                location--;
                if(location<0){
                    break;
                }
            }else {
                queue.add(current);
                location--;
                if(location<0) {
                    location = queue.size() - 1;
                }
            }
        }
        return  answer;
    }
    public int print3(int[] priorities, int location) { //안됨
        int pLength = priorities.length;
        int max = priorities[0] ;
        int maxIndex = 0;
        Stack<Integer> stack = new Stack< >();

        for(int i=1; i<pLength; i++) {
            if(max < priorities[i]) {
                max = priorities[i];
                maxIndex = i;
            }
        }

        if(max == priorities[location]) {
            return 1;
        }else {
            for(int i=0; i<pLength; i++) {
                if(max > priorities[i]) {
                    stack.push(i);
                    if(i == location) {
                        break;
                    }
                }
            }
        }
        return pLength-maxIndex+stack.size();
    }
}
