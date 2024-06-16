package Demo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

class DateSelectorr{
	public void selectDate(String selectedDate) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dateobj = new Date();
		long monthsBetween;
		int navigate=0;
        String currentDate = df.format(dateobj);
        
        monthsBetween = getMonthsBetweeen(selectedDate, currentDate);
        if(monthsBetween>0) {
        	clickPrevoius(monthsBetween);
        }
        else if(monthsBetween<0) {
        	clickNext(Math.abs(monthsBetween));
        }
        else {
        	System.out.println("Don't Click");
        }
        
        
	}
	
	public void clickPrevoius(long prev) {
		
	}
	
	public void clickNext(long next) {
		
	}
	
	public long getMonthsBetweeen(String selectedDate,String currentDate)
	{
		long monthsBetween = ChronoUnit.MONTHS.between(
        LocalDate.parse(selectedDate).withDayOfMonth(1),
        LocalDate.parse(currentDate).withDayOfMonth(1));
		
		return monthsBetween;
	}
	
}

public class SelectDate {
	
	public static void main(String args[]) {
		DateSelectorr ds=new DateSelectorr();
		ds.selectDate("2020-10-07");
	}

}

