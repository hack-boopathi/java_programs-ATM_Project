package Busreservation;
import java.util.*;
public class Busdemo {
public static void main (String[] args) {
	
	ArrayList<Bus> buses=new ArrayList<Bus>();
	ArrayList<booking> bookings=new ArrayList<booking>();
	
	buses.add(new Bus(1,true,1));
	buses.add(new Bus(2,false,20));
	buses.add(new Bus(3,true,10));
	Scanner sc=new Scanner(System.in);
	int userinput=1;
	for(Bus b:buses) {
		b.displaybusinfo(); 
	}
		while(userinput==1) {
			System.out.println("Enter 1 to book and 2 to exit");
			userinput=sc.nextInt();
			if(userinput==1) {
				booking  book=new booking();
				if(book.isAvailable(bookings,buses)) {
					bookings.add(book);
					System.out.println("your booking is successfulty...");
				}
				else {
					System.out.println("sorry.bus is full try another bus or date");
				}
			
			}

		
	}
}
}
