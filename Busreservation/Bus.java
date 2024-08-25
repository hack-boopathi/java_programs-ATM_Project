package Busreservation;

public class Bus {
private int busno;
 private int capacity;
 private boolean ac;
Bus(int no,boolean ac,int cap){
	this.busno=no;
	this.ac=ac;
	this.capacity=cap;
	
}
public int getbusno() {
	return busno;
}
public int getcapacity(){
	return capacity;	
}
public void setcapacity(int cap) {
	this.capacity=cap;
}
public boolean isac() {
	return ac;
}
public void setac(boolean ac) {
	this.ac=ac;
}
public void displaybusinfo(){
	System.out.println("busno: "+busno+" ac: "+ac+" total capacity: "+capacity);
}
}
