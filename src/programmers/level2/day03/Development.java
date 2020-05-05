package programmers.level2.day03;

import java.util.*;

public class Development {
    public static void main(String[] args) {
        int[] progresses = {40, 93, 30, 55, 60, 65}; //{40, 93, 30, 55, 60, 65} {93, 30, 55, 60, 40, 65}
        int[] speeds = {60, 1, 30, 5 , 10, 7}; //{60, 1, 30, 5 , 10, 7} {1, 30, 5 , 10, 60, 7}
                                               //{1,2,3} {2,4}
        Development development = new Development();
        System.out.println(Arrays.toString(development.function(progresses, speeds)));
        System.out.println(Arrays.toString(development.function2(progresses, speeds)));
    }
    public int[] function(int[] progresses, int[] speeds) {
        int result = 0;
        int current = 0;
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<progresses.length; i++) {
            result = (100-progresses[i])/speeds[i];
            queue.add(((100-progresses[i])%speeds[i] != 0) ? result+1 : result);
        }

        current = queue.poll();
        while(!queue.isEmpty()) {
            if(current >= queue.peek()) {
                cnt++;
                queue.poll();
            }else {
                arrayList.add(cnt);
                cnt = 1;
                current = queue.poll();
            }

            if(queue.isEmpty()) {
                arrayList.add(cnt);
                break;
            }
        }

        int[] answer = new int[arrayList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
    public int[] function2(int[] progresses, int[] speeds) {
        double remain;
        int date;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i=0; i<speeds.length; i++) {
            remain = (100-progresses[i])/(double)speeds[i];
            date = (int)Math.ceil(remain);

            if(!queue.isEmpty() && queue.peek() < date) {
                answerList.add(queue.size());
                queue.clear();
            }
            queue.offer(date);
        }

        answerList.add(queue.size());
        int[] answer = new int[answerList.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
