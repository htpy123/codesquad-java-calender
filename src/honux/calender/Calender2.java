package honux.calender;

import java.util.Scanner;

public class Calender2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		System.out.println("반복횟수를 입력하세요");
		int repeat = scanner.nextInt();
		
		for(int i = 0; i<repeat; i++) {
			System.out.println("달을 입력하세요");
			int push = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n",push, cal.getmaxDaysOfMonth(push));
		}
		System.out.println("Bye~");
		scanner.close();
	}
	
    private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getmaxDaysOfMonth(int push) {
		return MAX_DAYS[push-1];
	}
	 
}


