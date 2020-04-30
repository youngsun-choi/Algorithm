package programmers.level1.day12;

public class Star {
    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        StringBuffer stringBuffer = new StringBuffer();

        for(int i=1; i<=n*m; i++) {
            stringBuffer.append("*");
            if(i % n == 0) stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());

        //다른풀이
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
