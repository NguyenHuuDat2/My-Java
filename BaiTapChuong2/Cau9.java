package BaiTapChuong2;

import java.util.Scanner;

public class Cau9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		String name = scanner.nextLine();
		scanner.close();
		int length = name.length();
		System.out.println("Số ký tự trong họ tên: " + length);
		System.out.print("Ký tự 'a' xuất hiện tại vị trí: ");
		boolean found = false;
		/*
		 * int index = name.indexOf('a'); while (index != -1) { System.out.print(index +
		 * " "); found = true; index = name.indexOf('a', index + 1); }
		 */
		for (int i = 0; i < length; i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
				System.out.print(i + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.print("Không có ký tự 'a'");
		}

	}

}
