package myjava;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		System.out.println("Chon tinh nang:");
		System.out.println("1. CONG ");
		System.out.println("2. TRU ");
		System.out.println("3. END ");
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap lua chon cua ban: ");
		int value = scn.nextInt();
		switch (value) {
		case 1:
			System.out.println("Ban da chon phep cong");
			break;
		case 2:
			System.out.println("Ban da chon phep tru");
			break;
		default:
			System.out.println("Ban da chon ket thuc chuong trinh");
			System.exit(0);
		}
		scn.close();
	}

}
