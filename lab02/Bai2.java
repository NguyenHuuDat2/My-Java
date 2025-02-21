package lab02;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		float x;
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap vao a: ");
		int a = scn.nextInt();
		System.out.println("Nhap vao b: ");
		int b = scn.nextInt();
		System.out.println("Nhap vao  c: ");
		int c = scn.nextInt();
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("X =" + ((float) -c / b));
			}
		} else {
			int delta = b ^ 2 - 4 * a * c;
			System.out.println("Delta= " + delta);
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep X=" + (-b / 2 * a));

			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng biet: X1= " + (-b + Math.sqrt(delta) / (2 * a))
						+ " va X2= " + (-b - Math.sqrt(delta) / (2 * a)));
			}
		}

	}

}
