import java.util.*;
public class duplicate_string {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to find duplicate data:");
		String s=sc.nextLine();	
		String sa=s.toLowerCase();
		char [] ch = sa.toCharArray();
		int count=0;
		for (int i=0;i<ch.length;i++) {
			for (int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate string :"+ch[j]);
					count++;
				}
			}
		}
		System.out.println("count of duplicate:"+count);

	}

}
