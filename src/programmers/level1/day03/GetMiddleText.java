package programmers.level1.day03;

public class GetMiddleText {
	public static void main(String[] args) {
		String s = "qwer"; //"abcde" "qwer"
		String answer = "";
		int sLength = s.length();
		int sDivision = sLength/2;
		if(sLength != 0) {
			answer = (sLength % 2 != 0) ? s.substring(sDivision, sDivision+1) : s.substring(sDivision-1, sDivision+1);
		}
		System.out.println(answer);
		
		//다른 풀이
//		if(sLength != 0) {
//			answer = s.substring((sLength-1)/2, sLength/2+1) ;
//		}
//		System.out.println(answer);
	}
}
