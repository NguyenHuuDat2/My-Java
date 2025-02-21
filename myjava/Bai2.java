package myjava;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		int a = scn.nextInt();
		System.out.println("Nhap chieu rong: ");
		int b = scn.nextInt();
		System.out.println("Chu vi hcn la: " + (a + b) * 2);
		System.out.println("Dien tich hcn la: " + (a * b));
		System.out.println("Canh nho nhat la: " + Math.min(a, b));
		scn.close();
	}

}
