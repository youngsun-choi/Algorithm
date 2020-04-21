package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorArray {
	public static void main(String[] args) {
		int[] arr = {3,2,6}; //{5,9,7,10} {2,36,1,3} {3,2,6}
		int divisor = 10; //5 1 10
		
		System.out.println(divisor(arr, divisor));
	}
	public static int[] divisor(int[] arr, int divisor) {
		int arrLength = arr.length;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for(int i=0; i<arrLength; i++) {
			if(arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}else if(i == arrLength-1 && arrayList.size() == 0) {
				arrayList.add(-1);
			}
		}

		int arrayListSize = arrayList.size();
		int[] result = new int[arrayListSize];

		for(int i=0; i<arrayListSize; i++) {
			result[i] = arrayList.get(i);
		}

		Arrays.sort(result);

		//다른 풀이
//		int[] answer = Arrays.stream(arr).filter(data -> data % divisor == 0).toArray();
//		if(answer.length == 0) {
//			answer = new int[1];
//			answer[0] = -1;
//		}else {
//			Arrays.sort(answer);
//		}

		return result;
	}
}
