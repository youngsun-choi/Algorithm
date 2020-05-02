package programmers.level1.day14;

public class Dart {
    public static void main(String[] args) {
        String dartResult = "1D2S3T*"; //1D#2S*3S (5) 1D2S3T* (59)
        Dart d = new Dart();
        System.out.println(d.dart(dartResult));
    }
    public int dart(String dartResult){
        String[] strArray = dartResult.split("(?<=[#,*,S,D,T])");
        int[] result = new int[3];
        int strArrayLength = strArray.length;
        int resultLength = result.length;
        int score = 0, bonus = 0, sum = 0, num = 0, n1, n2;
        String b;

        for(int i=0; i<strArrayLength; i++) {
            if(strArray[i].length() != 1) {
                score = Integer.parseInt(strArray[i].replaceAll("[^0-9]",""));
                b = strArray[i].replaceAll("[^A-Z]","");
                bonus = (b.equals("S")) ? 1 : (b.equals("D")) ? 2 : 3;
                result[num] = (int)(Math.pow(score, bonus));

                if(num != resultLength-1) {
                    num++;
                }
            }else {
                n2 = (i == strArrayLength-1) ? num : num-1;
                if(strArray[i].charAt(0) == '*') {
                    if(num != 1) {
                        n1 = (i == strArrayLength-1) ? num - 1 : num - 2;
                        result[n1] *= 2;
                    }
                    result[n2] *= 2;
                }else if(strArray[i].charAt(0) == '#') {
                    result[n2] *= -1;
                }
            }
        }

        for(double data : result) {
            sum += (int)data;
        }
        return sum;
    }
}
