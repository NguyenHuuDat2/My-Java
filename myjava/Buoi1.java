package myjava;

import java.util.Scanner;

public class Buoi1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap a: ");
		String a = scn.nextLine();
		System.out.println("Nhap b: ");
		int b = scn.nextInt();
		System.out.println("ten va diem la" + a + " va " + b);
		scn.close();
	}
}
