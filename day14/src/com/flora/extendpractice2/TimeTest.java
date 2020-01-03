package com.flora.extendpractice2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeTest {
public static void main(String[] args) {
	String date = LocalDate.parse("2019-12-21").format(DateTimeFormatter.ISO_DATE_TIME);
	System.out.println(date);
	
}
}
