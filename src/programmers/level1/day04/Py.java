package programmers.level1.day04;

public class Py {
    public static void main(String[] args) {
        String s = "pPoooyY"; //"pPoooyY" "Pyy"
        boolean answer = true;
        Py py = new Py();

        System.out.println(py.pandy(s, answer));
    }
    public boolean pandy(String s, boolean answer) {
        char[] array = s.toLowerCase().toCharArray();
        int p = 0;
        int y = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i] == 'p') p++;
            else if(array[i] == 'y') y++;
        }
        answer = (p!=y) ? false : (p + y == 0) ? true : answer;
        return answer;
    }
    //다른풀이 - 오래걸림
    public boolean pandy2(String s, boolean answer) {
        s = s.toLowerCase();
        return s.chars().filter(e->'p'==e).count() == s.chars().filter(e->'y'==e).count();
    }
}
