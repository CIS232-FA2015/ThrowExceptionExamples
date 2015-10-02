package cis232.example;

public class WeekDay {
	int weekDayNum = 1;
	
	public WeekDay(int weekDay) throws WeekDayOutOfBoundsException{
		if(weekDay < 1 || weekDay > 7){
			throw new WeekDayOutOfBoundsException(weekDay);
		}
		this.weekDayNum = weekDay;
	}
}
