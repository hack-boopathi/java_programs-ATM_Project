
import java.util.Scanner;

public class typing_speed {
    public static void main(String[] args) {
        String ts="The quick brown fox jumps over the lazy dog";
        System.out.println("Type the follofwing sentance:");
        System.out.println(ts);
        long st= System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        String ui=sc.nextLine();
        long et=System.currentTimeMillis();
        long time=(et-st)/1000;
        String [] ta = ts.split(" ");
        String [] ua = ui.split(" ");
        int cc=0;
        int wc=0;
        for (int i=0;i<Math.min(ta.length,ua.length);i++){
            if(ta[i].equals(ua[i])){
                cc++;

            }
            else{
                wc++;
            }
        }
wc+=Math.max(0,ua.length-ta.length);
double Type=(cc/(double)time)*60;
System.out.println("time taken :"+time+"sce");
System.out.println("words typed correctly:"+cc);
System.out.println("words typed incorrectly:"+wc);
System.out.println("type speed :"+Type+"WPM"); 
    }
    
}
