package DateCount;

import java.util.Scanner;

public class MainDateCount {
	public static void main(String[] args) {
		DateCountMethod ob  = new DateCountMethod() ;
		//TODO: Insert D-M-Y
		System.out.println("Nhap ngay thang nam: ");

		System.out.print("\t Ngay: ");
		Scanner sc = new Scanner(System.in);

		int date = sc.nextInt();
		System.out.print("\t Thang: "); int month = sc.nextInt(); ob.getMonth(month) ;

		System.out.print("\t Nam: "); int year = sc.nextInt();

		//System.out.println("\t"+date + "/"+month+"/"+ year);
		
		//TODO: Calculating Method Call
		ob.checkYearDayMonth();
		ob.LeapYear();
		ob.calc();
	}
}
