import java.util.*;
public class multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter a value to multiplication tabel:");
		int a=sc.nextInt();
		for (int i =1;i<=a;i++) {
			System.out.println(i+"*"+a+"="+(i*a));
		}
	}

}
