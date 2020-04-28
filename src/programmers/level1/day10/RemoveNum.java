package programmers.level1.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveNum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1}; //{4,3,2,1} {10}
        int[] answer = {};
        RemoveNum removeNum = new RemoveNum();
        System.out.println(Arrays.toString(removeNum.remove(arr, answer)));
        System.out.println(Arrays.toString(removeNum.remove2(arr, answer)));
        System.out.println(Arrays.toString(removeNum.remove3(arr, answer)));
    }
    public int[] remove(int[] arr, int[] answer) {
        int arrLength = arr.length;
        if(arrLength == 1) {
            answer = new int[]{-1};
        }else {
            ArrayList<Integer> arrayList = new ArrayList<>();

            for(int data:arr) {
                arrayList.add(data);
            }

            Integer min = Collections.min(arrayList);
            arrayList.remove(min);

            int arrayListSize = arrayList.size();
            answer = new int[arrayListSize];

            for(int i=0; i<arrayListSize; i++) {
                answer[i] = arrayList.get(i);
            }
        }
        return answer;
    }
    public int[] remove2(int[] arr, int[] answer) {
        int arrLength = arr.length;
        if(arrLength == 1) {
            answer = new int[]{-1};
        }else {
            int min = arr[0];
            for(int i=0; i<arrLength; i++) {
                min = Math.min(arr[i],min);
            }

            answer = new int[arrLength-1];
            int j = 0;
            for(int i=0; i<arrLength-1; i++) {
                if(arr[j] == min) {
                    j++;
                    i--;
                    continue;
                }
                answer[i] = arr[j];
                j++;
            }
        }
        return answer;
    }
    public int[] remove3(int[] arr, int[] answer) {
        int arrLength = arr.length;
        if(arrLength == 1) {
            answer = new int[]{-1};
        }else {
            int min = Arrays.stream(arr).min().getAsInt();
            answer = Arrays.stream(arr).filter(i->i!=min).toArray();
        }
        return answer;
    }
}
