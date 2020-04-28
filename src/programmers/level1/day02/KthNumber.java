package programmers.level1.day02;

import java.util.Arrays;

public class KthNumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int commandsLength = commands.length;
		int[] answer = new int[commandsLength];
		int[] tmp = {};
		
		for(int i=0; i<commandsLength; i++) {
			tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(tmp);
			answer[i] = tmp[commands[i][2]-1];
		}
		System.out.println(Arrays.toString(answer));
	}
}
