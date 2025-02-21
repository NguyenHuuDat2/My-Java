package myjava;

import java.util.Scanner;

public class Ifelse {
//duoi 10 k dong thue
//10 -15 thue 10%
//15-30 thue 50%
//tren 30m thue 50%
	public static void main(String[] args) {
		System.out.println("Nhap so gai tri de phan biet thue: ");
		int tax = new Scanner(System.in).nextInt();
		if (tax < 10) {
			System.out.println("Khong dong thue");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("Thue 10%");
		} else if (15 <= tax && tax <= 30) {
			System.out.println("Thue 20%");
		} else {
			System.out.println("Thue 50%");
		}

	}

}
