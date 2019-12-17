7package ashi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
	sh.nextInt();
		int[] arr = {1,3,4,6,7,3,8,4,8,4,8};
		System.out.print("Fatch duplicate ele === " );
		Set<Integer> s = new HashSet<>();
		for (int num : arr) {
			if (s.add(num)==false) {
				System.out.print(num+" ");
			}
		}
		
	}

}
