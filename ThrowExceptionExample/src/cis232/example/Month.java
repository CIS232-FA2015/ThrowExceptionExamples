package cis232.example;

public class Month {
	private int monthNum;

	public Month(int month) {
		monthNum = month;
		if (monthNum < 1 || monthNum > 12) {
			throw new IllegalArgumentException("month must be between 1 and 12");
		}
	}

	public String getMonthName() {
		switch (monthNum) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Smarch";
		}
	}
}
