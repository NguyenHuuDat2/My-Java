package myjava;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap gia tri canh : ");
		int a = scn.nextInt();
		System.out.println("The tich cua khoi lap phuong la : " + Math.pow(3, a));
		scn.close();
	}

}
