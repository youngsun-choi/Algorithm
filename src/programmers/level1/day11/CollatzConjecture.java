package programmers.level1.day11;

public class CollatzConjecture {
    public static void main(String[] args) {
        int num = 1;
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        System.out.println(collatzConjecture.collatz(num));
        System.out.println(collatzConjecture.collatz2(num));
    }
    public int collatz(int num) {
        int cnt = 0;
        long longNum = (long)num;
        while(longNum != 1) {
            if(cnt == 500) break;
            longNum = (longNum % 2 == 0) ? longNum / 2 : longNum * 3 + 1;
            cnt++;
        }
        cnt = (cnt == 500) ? -1 : cnt;
        return cnt;
    }
    public int collatz2(int num) {
        long longNum = (long)num;
        for(int i=0; i<500; i++) {
            if(longNum == 1) return i;
            longNum = (longNum % 2 == 0) ? longNum / 2 :longNum * 3 + 1;
        }
        return -1;
    }
}
