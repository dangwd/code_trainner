package fita.vnua.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	public static Date stringToDate(String ngaySinhStr) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = sdf.parse(ngaySinhStr);
			
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return date;
	}
}
