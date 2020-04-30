package programmers.level1.day12;

public class Xdistance {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        Xdistance xdistance = new Xdistance();

        System.out.println(xdistance.distance(x,n));
    }
    public long[] distance(int x,int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++) {
            answer[i] = (i+1) * (long)x;
        }
        return answer;
    }
}
