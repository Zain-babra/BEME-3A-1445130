package Clock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alarm_clock obj1 = new Alarm_clock();
		for(int i=0;i<=3600;i++)
		{
			obj1.setAlarm(0, 57);
			obj1.ShowTime();
			obj1.tick();
		}
	}

}
