package honux.calender;

import java.util.Scanner;

public class Calender2 {
	public static void main(String[] args) {
		String PROMPT ="cal> ";
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		int repeat;
		int push = 0;
		while(true) {
			System.out.println("달을 입력하세요");
			System.out.println(PROMPT);
			push = scanner.nextInt();
			if(push == -1) {
				break;
			}
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


