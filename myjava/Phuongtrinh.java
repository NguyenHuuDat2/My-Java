package myjava;

import java.util.Scanner;

public class Phuongtrinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		float x;
		System.out.println("Nhap a :");
		a = new Scanner(System.in).nextInt();
		System.out.println("Nhap b : ");
		b = new Scanner(System.in).nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT co vo so nghiem");
			} else {
				System.out.println("PT vo nghiem");
			}
		} else {
			x = -b / (float) a;
			System.out.println("PT co Nghiem la : " + x);
		}

	}

}
