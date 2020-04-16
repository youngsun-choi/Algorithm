package programmers.level1;

import java.util.Calendar;
import java.util.Locale;

public class DayOfWeek2016 {
	public static void main(String[] args) { //2016년 1월 1일은 금요일이므로 금요일부터 시작
		String[] dayName= {"FRI","SAT","SUN","MON","TUE","WED","THU"}; 
		String answer = "";
		int a = 5;
		int b = 24;
		int year = 2016;
//		String month = (a < 10) ? "0"+a : String.valueOf(a); 
//		String days = (b < 10) ? "0"+b : String.valueOf(b); 
//		
//		LocalDate localDate = LocalDate.parse(year+"-"+month+"-"+days);
//		answer = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
//		System.out.println(answer);
		
		//다른 풀이
		Calendar calendar = new Calendar.Builder().setCalendarType("iso8601").setDate(year, a-1, b).build();
		answer = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US).toUpperCase();
		System.out.println(answer);
	}
}
