package honux.calender1;

import java.util.Scanner;

public class calendar {
	private final static String PROMPT ="cal> ";
	int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args) {
	
		System.out.println("달을 입력 해주세요");
		System.out.print(PROMPT);
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		calendar cal = new calendar();
		cal.print(month);
		scanner.close();	
	}
	
	
	public void print(int month) {
		System.out.println(month + "월 달력");
		System.out.println("일  월  화  수  목  금  토 ");
		System.out.println("=================");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");		
		System.out.println("22 23 24 25 26 27 28");
		switch(mon[month-1]){
			case 29:
				System.out.println("29");
				break;
			case 30:
				System.out.println("29 30");
				break;
			case 31:
				System.out.println("29 30 31");
				break;
		}
	}
	

}
