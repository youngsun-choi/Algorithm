package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorArray {
	public static void main(String[] args) {
		int[] arr = {3,2,6}; //{5,9,7,10} {2,36,1,3} {3,2,6}
		int arrLength = arr.length;
		int divisor = 10; //5 1 10
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0; i<arrLength; i++) {
			if(arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}else if(i == arrLength-1 && arrayList.size() == 0) {
				arrayList.add(-1);
			}
		}
		
		int arrayListSize = arrayList.size();
		int[] answer = new int[arrayListSize];
		
		for(int i=0; i<arrayListSize; i++) {
			answer[i] = arrayList.get(i);
		}

		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));
		
		//다른 풀이
//		int[] answer = Arrays.stream(arr).filter(data -> data % divisor == 0).toArray();
//		if(answer.length == 0) {
//			answer = new int[1];
//			answer[0] = -1;
//		}else {
//			Arrays.sort(answer);
//		}
//		System.out.println(Arrays.toString(answer));
	}
}
