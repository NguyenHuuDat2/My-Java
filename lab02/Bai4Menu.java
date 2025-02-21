package lab02;

import java.util.Scanner;

public class Bai4Menu {
	public static void bai1() {

	}

	public static void bai2() {

	}

	public static void bai3() {

	}

	public static void main(String[] args) {
		System.out.println("Chon tinh nang:");
		System.out.println("1. Giai pt bac I ");
		System.out.println("2. Giai pt bac II ");
		System.out.println("3. Tinh so tien dien ");
		System.out.println("3. END ");
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap lua chon cua ban: ");
		int chon = scn.nextInt();
		switch (chon) {
		case 1:
			bai1();
			System.out.println("Ban ra in1");
			break;
		case 2:
			bai2();
			System.out.println("Ban ra in2");
			break;
		case 3:
			bai3();
			System.out.println("Ban ra in3");
			break;
		default:
			System.out.println("Ban ra out");
			System.exit(0);

		}

	}

}
