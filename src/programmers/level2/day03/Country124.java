package programmers.level2.day03;

public class Country124 {
    public static void main(String[] args) {
        int n = 1023;
        Country124 country124 = new Country124();
        System.out.println(country124.country(n));
        System.out.println(country124.country2(n));
    }
    public String country(int n) {
        String answer = "";
        int reminder;
        StringBuilder stringBuilder = new StringBuilder("");

        while(n>0) {
            reminder = n%3;
            n = n/3;

            if(reminder == 0) {
                n -= 1;
                reminder = 4;
            }
            answer = stringBuilder.insert(0, reminder).toString(); // //answer = reminder + answer;
        }
        return answer;
    }
    public String country2(int n) {
        String[] num = {"4","1","2"};
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder("");

        while(n>0) {
            answer = stringBuilder.insert(0, num[n%3]).toString(); //answer = num[n%3] + answer;
            n = (n-1) / 3;
        }
        return answer;
    }
}
