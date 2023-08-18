package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

	public static String dateconverter() {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:sss");

		String orderdate = simpleDateFormat.format(new Date(System.currentTimeMillis()));

		return orderdate;

	}

}
