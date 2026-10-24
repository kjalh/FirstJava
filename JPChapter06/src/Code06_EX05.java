import java.util.Calendar;

public class Code06_EX05 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");
		
		if(4<hour && 12>hour)
			System.out.println("Good morning");
		else if(12<=hour && 18>hour)
			System.out.println("Good Afternoon");
		else if(18<hour && 22>hour)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}
