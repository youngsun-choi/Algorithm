package programmers.level1.day12;

public class CellPhone {
    public static void main(String[] args) {
        String phone_number = "027778888";
        CellPhone cellPhone = new CellPhone();
        System.out.println(cellPhone.cellPhone(phone_number));
        System.out.println(cellPhone.cellPhone2(phone_number));
        System.out.println(cellPhone.cellPhone3(phone_number));
    }
    public String cellPhone(String phone_number) {
        int phoneNumLength = phone_number.length();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i=1; i<=phoneNumLength-4; i++) {
            stringBuffer.append("*");
        }
        String backNumber = phone_number.substring(phoneNumLength-4, phoneNumLength);
        stringBuffer.append(backNumber);
        return stringBuffer.toString();
    }
    public String cellPhone2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i=0; i<ch.length-4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
    public String cellPhone3(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})","*");
    }
}
