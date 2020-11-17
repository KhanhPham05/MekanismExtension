package DateCount;

import java.util.Scanner;

public class DateCountMethod implements IDateCount {
	int day;
	int date, month, year;
	boolean isLeap;
	int result;
//	int z;

	public DateCountMethod() {
	}

	//TODO: count for leap year
	public void LeapYear() {
		if (this.year % 4 == 0 && this.year % 100 != 0) {
			this.isLeap = true;
			System.out.println("Day la nam nhuan");
		} else {
			this.isLeap = false;
			System.out.println("day khong phai la nam nhuan");
		}
	}

	//TODO: Implements and Calculating
	@Override
	public void getDate(int date) {
		this.date = date;
	}

	@Override
	public void getMonth(int month) {
		this.month = month;
	}

	@Override
	public void getYear(int year) {
		this.year = year;

	}

	@Override
	public void getDayMonthYear(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;

	}

	public void checkYearDayMonth(){
		//check for invalid month > 12
		Scanner sc = new Scanner(System.in);
		while (this.month > 12){ System.out.print("Thang ban nhap khong hop le. Moi bann nhap lai\n \t Thang: ");
								int newMonth = sc.nextInt();
								this.month = newMonth;
		};
		//check for invalid day <= 0
		while (this.date <=0 ) { System.out.print("You just typed the wrong day. Try again\n \t Date:");
								int newDate = sc.nextInt();
								this.date = newDate;
		}

		//check for invalid year <0
		while (this.year < 0){ System.out.print("Nam bajn nhap khong hop le. Moi ban nhap lai= \n \t Nam: ");
								int newYear = sc.nextInt();
								this.date = newYear;
		}
	}
	@Override
	public void calc() {
		int dayCount ;
		//int day;             //thang 2
		int month[] = {31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		loopMonth:
		for (int i = 0; i <= this.month; i++) {
			for (dayCount= 1; dayCount <= month[i]; dayCount++){

				//TODO: calc with leap year
				if(this.isLeap && i == 1){
					System.out.println("Da bo qua nam khong nhuan");

					continue loopMonth;
				}

				//TODO: calc with non-leap year
				if(!this.isLeap && i == 2){
					System.out.println("Da bo qua nam nhuan");

					continue loopMonth;
				}
				//System.out.println("month["+i+"]"+dayCount);
			}

			this.result =+ this.result + dayCount;
			this.result -- ;
			System.out.println("month["+i+"]"+ this.result);

		}

		System.out.println("Day la ngay thu: " + this.result);

	}

}