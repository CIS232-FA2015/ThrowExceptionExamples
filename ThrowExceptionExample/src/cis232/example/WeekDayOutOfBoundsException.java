package cis232.example;

public class WeekDayOutOfBoundsException extends Exception{
	public WeekDayOutOfBoundsException(int value){
		super(String.format("%d is not a valid week day. Should be between 1 and 7 inclusive.", value));
	}
}
