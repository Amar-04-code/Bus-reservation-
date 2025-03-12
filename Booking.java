package BusRes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String PassengerName;
	int busNo;
	Date date;

	Booking()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of passenger : ");
		PassengerName = sc.next();
		System.out.println("Enter bus no: ");
		sc.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
			
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses)
	{
	  int capacity = 0;
	  for(Bus bus:buses)
	  {
		  if(bus.getBusNo() == busNo)
			  capacity = bus.getCapacity();
	  }
	  int booked = 0;
	  for(Booking b : bookings)
	  {
		if(b.busNo == busNo && b.date.equals(date));
			booked++;
	  }
	  return booked<capacity?true:false; 
	}
	
		
	
}


