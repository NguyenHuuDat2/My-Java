package lab02;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		float x;
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen a: ");
		int a = scn.nextInt();
		System.out.println("Nhap vao so nguyen b: ");
		int b = scn.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("X =" + (x = (float) -b / a));
		}
		scn.close();
	}

}
