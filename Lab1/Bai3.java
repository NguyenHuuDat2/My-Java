package Lab1;
import java.util.*;
public class Bai3 {
 public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int a[],n;
	System.out.print("Nhap so phan tu trong mang: ");
	n=input.nextInt();
	a=new int[n];
	for(int i=0;i<a.length;i++) {
		System.out.print("a["+i+"] =");
		a[i]=input.nextInt();
	}
	System.out.print("\nMang vua nhap :");
	XuatMang(a);
	System.out.print("\n\nPhan tu lon nhat trong mang : "+Max(a));
	input.close();
	
}
 	public static void XuatMang(int a[]) {
 		for(int i=0;i<a.length;i++)
 			System.out.print("\t"+a[i]);
 	}
 	public static int Max(int a[]) {
 		int max=a[0];
 		for(int i=1;i<a.length;i++) {
 		if(a[i]>max) {
 			max=a[i];
 		}
 	}
 		return max;
 	}
}
