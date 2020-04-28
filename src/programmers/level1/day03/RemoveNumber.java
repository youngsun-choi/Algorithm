package programmers.level1.day03;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNumber {
	public static void main(String[] args) {
		int[] arr= {1,1,3,3,0,1,1}; //{1,1,3,3,0,1,1} {4,4,4,3,3}
		int tmp = -1;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int data:arr) {
			if(tmp != data) {
				arrayList.add(data);
				tmp = data;
			}
		}
		
		int arrayListSize = arrayList.size();
		int[] answer = new int[arrayListSize];
		
		for(int i=0; i<arrayListSize; i++) {
			answer[i] = arrayList.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}

