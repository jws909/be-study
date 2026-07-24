package be_study.db.v3;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateUtil {
	
	// Timestamp -> LocalDateTime
	public static LocalDateTime convertTimestampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}
	
	// LocalDateTime -> Timestamp
	public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt);
	}
	
	// String(yyyy-MM-dd HH:mm:ss) -> LocalDateTime
	public static LocalDateTime convertDateTimeStringToLocalDateTime(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.parse(str, fmt);
		
		return ldt;
	}
	
	// String(yyyy-MM-dd) -> LocalDateTime
	public static LocalDateTime convertDateStringToLocalDateTime(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld.atStartOfDay();
	}
	
	// String(yyyy/MM/dd) -> LocalDateTime
	public static LocalDateTime convertDateStringToLocalDateTime2(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld = LocalDate.parse(str, fmt);
			
		return ld.atStartOfDay();
	}
	
	// String(yyyyMMdd) -> LocalDateTime
	public static LocalDateTime convertDateStringToLocalDateTime3(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate ld = LocalDate.parse(str, fmt);
				
		return ld.atStartOfDay();
	}
	
	//convertDateStringToLocalDateTimeWithFormat("2022-02-02", "yyyy-MM-dd")
	public static LocalDateTime convertDateStringToLocalDateTimeWithFormat(String str, String format) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(format);
		LocalDate ld = LocalDate.parse(str, fmt);
				
		return ld.atStartOfDay();
	}
	
	public static LocalDate convertDateStringToLocalDate(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld;
	}
	
	// LocalDate -> LocalDateTime
	public static LocalDateTime convertLocalDateToLocalDateTime(LocalDate ld) {
		return ld.atStartOfDay();
	}
	
	// LocalDateTime -> String
	public static String convertLocalDateTimeToDateString(LocalDateTime ldt) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return ldt.format(fmt);
	}
	
	public static String convertLocalDateTimeToDateString2(LocalDateTime ldt) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
		return ldt.format(fmt);
	}
	
	public static String convertLocalDateTimeToDateTimeString(LocalDateTime ldt) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return ldt.format(fmt);
	}
	
	//convertLocalDateTimeToDateStringWithFormat(LocalDateTime ldt, "yyyy-MM-dd")
	public static String convertLocalDateTimeToDateString(LocalDateTime ldt, String format) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(format);
		return ldt.format(fmt);
	}
}
