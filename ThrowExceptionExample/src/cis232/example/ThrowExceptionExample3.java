package cis232.example;

public class ThrowExceptionExample3 {

	public static void main(String[] args) {
		try{
			WeekDay w = new WeekDay(8);
		}catch(WeekDayOutOfBoundsException e){
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
