package programmers.level1.day02;

public class GymClothes {
	public static void main(String[] args) {
		int n = 5; 				 //       3 
		int[] lost = {2,4}; 	 //{2,4} {3}
		int[] reserve = {1,3,5}; // {3} {1}

		System.out.println(gym(n, lost, reserve));
	}

	public static int gym(int n, int[] lost, int[] reserve) {
		int lostLength = lost.length;
		int reserveLength = reserve.length;
		int answer = n - lostLength;

		//여벌 체육복을 가져온 학생이 체육복을 도난당했을 경우, 음수값 대입
		for(int i=0; i<lostLength; i++) {
			for(int j=0; j<reserveLength; j++) {
				if(lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		for(int i=0; i<lostLength; i++) {
			for(int j=0; j<reserveLength; j++) {
				if((lost[i] != -1 || reserve[j] != -1) &&
						(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j])) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}

		//다른 사람 풀이
//		int[] people = new int[n];
//		int answer = n;
//		int peopleLength = people.length;
//
//		for(int lData:lost) {
//			people[lData-1]--;
//		}
//		for(int rData:reserve) {
//			people[rData-1]++;
//		}
//
//		for(int i=0; i<peopleLength; i++) {
//			if(people[i] == -1) {
//				if(i-1 >= 0 && people[i-1] == 1) {
//					people[i]++;
//					people[i-1]--;
//				}else if(i+1 < peopleLength && people[i+1] == 1) {
//					people[i]++;
//					people[i+1]--;
//				}else {
//					answer--;
//				}
//			}
//		}

		return answer;
	}
}
