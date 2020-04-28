package programmers.level1.day09;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 13;

        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.root(n));
        System.out.println(squareRoot.root2(n));
    }
    public long root(long n) {
        return (Math.sqrt(n) == (int)Math.sqrt(n)) ? (long)Math.pow(Math.sqrt(n)+1,2) : -1;
    }
    //다른풀이
    public long root2(long n) {
        return (Math.pow((int)Math.sqrt(n),2) == n) ? (long) Math.pow(Math.sqrt(n)+1,2) : -1;
    }
}
