package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
	public static int[] exam(int[] answers, int[] supoja1, int[] supoja2, int[] supoja3) {
		int supoja1Length = supoja1.length;
		int supoja2Length = supoja2.length;
		int supoja3Length = supoja3.length;
		int count1 = 0, count2 = 0, count3 = 0;

		for(int i=0; i<answers.length; i++) {
			if(answers[i] == supoja1[i%supoja1Length]) count1++;
			if(answers[i] == supoja2[i%supoja2Length]) count2++;
			if(answers[i] == supoja3[i%supoja3Length]) count3++;
		}

		int max = Math.max(count1, Math.max(count2, count3));
		ArrayList<Integer> resultList = new ArrayList<Integer>();

		if(max == count1) resultList.add(1);
		if(max == count2) resultList.add(2);
		if(max == count3) resultList.add(3);

		int[] answer = new int[resultList.size()];

		for(int i=0; i<answer.length; i++) {
			answer[i] =  resultList.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5}; //{1,3,2,4,2} {1,2,3,4,5}
		int[] supoja1 = {1,2,3,4,5};
		int[] supoja2 = {2,1,2,3,2,4,2,5};
		int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};

		System.out.println(Arrays.toString(exam(answers, supoja1, supoja2, supoja3)));
	}
    
}