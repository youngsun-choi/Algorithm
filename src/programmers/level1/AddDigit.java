package programmers.level1;

public class AddDigit {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;

        AddDigit addDigit = new AddDigit();

        System.out.println(addDigit.add(n,answer));
        System.out.println(addDigit.add2(n,answer));
    }
    public int add(int n, int answer) {
        while(n / 10 != 0) {
            answer += n % 10;
            n /= 10;
        }
        answer += n;
        return answer;
    }
    //다른풀이
    public int add2(int n, int answer) {
        while (true) {
            answer += n%10;
            if(n<10) break;
            n /= 10;
        }
        return answer;
    }
}
