package test.GoodWorkLabs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromedescendantFinalAssign2 {

	public static void main(String[] args) {

		long num = 363;
		long num2 = 123;
		long num3 = 123312;
		long num4 = 11211230; // true

		addAndCheckSum(num4);
		System.out.println();
		System.out.println("Executed Successfully!");
	}

	public static void addAndCheckSum(long num) {

		long temp = num;
		
		List<Long> list = new ArrayList<Long>();
		ArrayList<Long> al = new ArrayList<Long>();
		int i = 0;
		long mod;
		long rev = 0;
		long sum = 0;

		String s = "";
		while (temp > 0) {
			mod = temp % 10;
			if (i < 2) {
				sum = sum + mod;
				rev = 10 * rev + mod;
				// System.out.println("Sum = " + sum);
				i++;

			}
			temp = temp / 10;

			if (i >= 2) {
				list.add(sum);
				String strsum = String.valueOf(sum);
				s = s.concat(strsum);
				i = 0;
				sum = 0;
			}

		}
		System.out.print(s);
		//list.forEach(x -> System.out.println(x));

		//al = reverseLinkedList(list);
		long num2 = Long.parseLong(s);
		System.out.println();
		System.out.print(num2);
		String srev = reverse(s);
		System.out.println();
		System.out.print(srev +"srev");
		if (s.equals(srev)) {
			System.out.println("palindrome");
			
		}

		else {
			long strnum = Long.parseLong(s);
			System.out.println("Not a palindrome");
			System.out.println("Calling method again");
			addAndCheckSum(strnum);
			

		}

	}

	public static String reverse(String str) {
		String s ="";
		for (int i = str.length() - 1; i >= 0; i--) {

			s = s+str.charAt(i);
			
		}
		// Return the reversed arraylist
		return s;
	}

}
