package myjava;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int[] club = { 5, 7, 2 };

		for (int i = 0; i < club.length - 1; i++) {
			for (int j = i + 1; j < club.length; j++) {
				if (club[i] > club[j]) {
					int temp = club[i];
					club[i] = club[j];
					club[j] = temp;
				}
			}
		}

		// Arrays.sort(club);
		System.out.println(Arrays.toString(club));

	}

}
