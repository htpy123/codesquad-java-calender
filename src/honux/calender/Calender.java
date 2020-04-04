package honux.calender;

import java.util.Scanner;

public class Calender {
	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getmaxDaysOfMonth(int push) {
		return MAX_DAYS[push-1];
	}
	
	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}
	
	public static void main(String[] args) {
		
		System.out.print("원하는 달의 일수를 알려드립니다 :");
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		int push = scanner.nextInt();
		
		if(push>0&&push<13) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", push, cal.getmaxDaysOfMonth(push));
		}else {
			System.out.println("숫자는 1~12까지만 입력해 주세요");
		}
		scanner.close();
	}
}
