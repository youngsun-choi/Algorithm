package programmers.level2.day05;

public class Square {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;
        Square square = new Square();

        System.out.println(square.square1(w, h));
        System.out.println(square.square2(w, h));
    }
    //다른사람풀이
    public long square1(int w, int h) {
        long answer = 0;
        for(int i=0; i<w; i++) {
            answer += (Long.valueOf(h)*i)/Long.valueOf(w);
        }
        return answer*2;
    }
    public long square2(int w, int h) {
        long answer = 0;
        long w1 = Long.valueOf(w);
        long h1 = Long.valueOf(h);

        return (w1*h1) - (w1+h1-gcd(w1, h1));
    }
    private static long gcd(long w, long h) {
        long small, big, nmg;

        big = (w >= h) ? w : h;
        small = (w < h) ? w : h;

        while (small != 0) {
            nmg = big % small;
            big = small;
            small = nmg;
        }
        return big;
    }
}
