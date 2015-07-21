package com.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ABC {

	public static void main(String[] args) {
		Date date11 = new Date();
        String format = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateStr = sdf.format(date11);
        System.out.println(dateStr);

	}
}
