package InterviewQuestions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		DateFormat dt= new SimpleDateFormat("yyyy/MM/dd");
		Date date=new Date();
		System.out.println(dt.format(date));
//		LocalDateTime ldt=LocalDateTime.now();
//		System.out.println(ldt);
		String date1 ="2020-10-27";
		LocalDate localdate=LocalDate.parse(date1);
		System.out.println(localdate);
		
		
			

	}

}
