package Lab1;
import java.lang.Math;
import java.util.*;
public class Bai1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a,b,c;
	System.out.print("Nhap so a :");
	a= input.nextInt();
	System.out.print("Nhap so b :");
	b= input.nextInt();
	System.out.print("Nhap so c :");
	c= input.nextInt();
	int max=Math.max(a, Math.max(b,c));
	System.out.print("So lon nhat la : " +max);
	input.close();
}
}
