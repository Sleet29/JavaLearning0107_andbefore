package baek;
import java.util.Scanner;

public class Test06 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        sc.close();
        
        System.out.println(n/m);
        System.out.print(n%m);
    }
}