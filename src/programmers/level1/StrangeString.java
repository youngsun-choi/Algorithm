package programmers.level1;

public class StrangeString {
    public static void main(String[] args) {
        String s = "try hello world"; //try hello world
        StrangeString strangeString = new StrangeString();
        System.out.println(strangeString.strangeStr(s));
    }
    public String strangeStr(String s) {
        String[] strArray = s.split(" ",-1);
        char c = ' ';
        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<strArray.length; i++) {
            for(int j=0; j<strArray[i].length(); j++) {
                c = strArray[i].charAt(j);
                if(j % 2 == 0 && Character.isLowerCase(c)) {
                    c = (char)(c-32);
                }else if(j % 2 != 0 && Character.isUpperCase(c)){
                    c = (char)(c+32);
                }
                stringBuffer.append(c);
            }
            if(i != strArray.length-1) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }
    public String strangeStr2(String s) {
        String answer = "";
        int cnt = 0;
        String[] strArray = s.split("");
        StringBuffer stringBuffer = new StringBuffer();

        for(String str:strArray) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            stringBuffer.append((cnt % 2 == 0) ? str.toLowerCase() : str.toUpperCase());
        }
        return answer;
    }
}
