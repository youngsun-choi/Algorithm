package programmers.level1.day11;

public class Harshad {
    public static void main(String[] args) {
        int x = 200;
        Harshad h = new Harshad();
        System.out.println(h.harshad(x));
        System.out.println(h.harshad2(x));
        System.out.println(h.harshad3(x));
    }
    public boolean harshad(int x) {
        int mox = x;
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return mox%sum == 0 ? true : false;
    }
    public boolean harshad2(int x) {
        String[] str = String.valueOf(x).split("");
        int sum = 0;

        for(String data:str) {
            sum += Integer.parseInt(data);
        }

        return x%sum == 0 ? true : false;
    }
    private int sum;
    public boolean harshad3(int x) {
        sum = 0;
        Integer.toString(x).chars().forEach(e -> sum += e - '0');
        return x%sum == 0 ? true : false;
    }
}
