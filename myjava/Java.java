package myjava;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b, c;
		System.out.println(" Nhap ho ten: ");
		a = new Scanner(System.in).nextLine();
		System.out.println("Nhap MSSV: ");
		b = new Scanner(System.in).nextLine();
		System.out.println(" Nhap lop: ");
		c = new Scanner(System.in).nextLine();
		args = new String[] { a, b, c };
		System.out
				.println("\tThong tin ban than" + "\nHo ten: " + args[0] + "\nMssv: " + args[1] + "\nLop: " + args[2]);
	}

}
