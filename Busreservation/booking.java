package Busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class booking {
	String passengername;
	int busno;
	Date date;
booking(){
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter a passenger name:");
	passengername=sc1.nextLine();
	System.out.println("Enter bus no:");
	busno=sc1.nextInt();
	System.out.println("Enter a date dd-MM-yyyy:");
	String dateinput=sc1.next();
	SimpleDateFormat dateformate =new SimpleDateFormat("dd-MM-yyyy");
	try {
		dateformate.parse(dateinput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public boolean isAvailable  (ArrayList<booking> bookings,ArrayList<Bus> buses){
	int capacity=0;
	int count=0;
	for(Bus bus:buses) {
		if(bus.getbusno()==	 busno) {
			capacity=bus.getcapacity();
		}
		
		for(booking b:bookings) {
			if(b.busno == busno && b.date.equals(date)) {
				count++;
			}
		}
		
	}
	return count<capacity?true:false;
	
}
}
