package Lab1;
import java.util.*;
public class Lab1_1 {
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b;
		System.out.print("Nhap so a :");
		a= input.nextInt();
		System.out.print("Nhap so b :");
		b= input.nextInt();
		if(a==b) {
			System.out.println(a+" = "+b);
		}else {
			if(a>b) {
			System.out.println(a+" > "+b);
			}
			else if(a<b)
			{
				System.out.println(a+" < "+b);
			}
		
		}
		
		input.close();
	}
}


