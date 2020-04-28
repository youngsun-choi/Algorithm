package programmers.level1.day09;

public class DecendingInteger {
    public static void main(String[] args) {
        long n = 118372;
        DecendingInteger decendingInteger = new DecendingInteger();
        System.out.println(decendingInteger.decending(n));
        System.out.println(decendingInteger.decending2(n));
    }
    public long decending(long n) {
        String str = "" + n;
        int strLength = str.length();
        long[] array = new long[strLength];
        long tmp;
        StringBuffer answer = new StringBuffer();

        for(int i=0; i<strLength; i++) {
            array[i] = n%10;
            n /= 10;
        }

        for(int i=0; i<strLength; i++) {
            for(int j=i+1; j<strLength; j++) {
                if(array[i] < array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
            answer.append(array[i]);
        }

        return Long.parseLong(answer.toString());
    }

    public long decending2(long n) {
        StringBuffer sb = new StringBuffer();
        Long.toString(n).chars().sorted().forEach(c -> sb.append(Character.valueOf((char)c)));
        return Long.parseLong(sb.reverse().toString());
    }
}
