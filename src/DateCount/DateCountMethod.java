package DateCount;

public class DateCountMethod implements IDateCount {
	int day;
	int date, month, year;
	boolean isLeap;
	int result;

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

	@Override
	public void calc() {
		int dayCount ;
		int day;             //thang 2
		int month[] = {31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		loopMonth:
		for (int i = 0; i <= 12; i++) {
			for (dayCount= 0; dayCount <= month[i]; dayCount++){
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
			}
			this.result = dayCount;
		}

		System.out.println("Day la ngay thu: " + this.result);

	}

}