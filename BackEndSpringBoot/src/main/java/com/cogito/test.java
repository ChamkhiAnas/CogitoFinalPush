package com.cogito;

import java.time.LocalDate;
import java.time.Month;

public class test{
	
	
	public static void main(String[] args) {
		LocalDate d = LocalDate.of( 2040, Month.APRIL, 30);
		d.plusDays(2);
		d.plusYears(3);
		System.out.println(d.getYear() + " " + d.getMonth() + " " + d.getDayOfMonth() );
		
	}
	
}