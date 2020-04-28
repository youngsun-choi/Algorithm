package programmers.level1.day01;

import java.util.Arrays;

public class Player {
	public static void main(String[] args) {
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i=0; i<completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				break;
			}
		}
		System.out.println(participant[i]);
	}
}
