package Clock;

	public class Alarm_clock extends Clock 
	{
	      private boolean alarmOn;
	      private int hrSet, minSet;
	      public Alarm_clock( ) 
	      {alarmOn = false;}  //the alarm is not set initially
	      public void setAlarm(int hr, int min)
	      {
	    	  hrSet = hr; minSet = min; alarmOn = true;
	     }
 public void tick( )
	 {
	    	  super.tick( );
	    if ((viewHr( ) == hrSet)&&(viewMin() == minSet)&&alarmOn)
	    {
			System.out.println("ring, ring, ring");
		}
	}
	      public void resetAlarm( )  
	      {alarmOn = false;}
}
