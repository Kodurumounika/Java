package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
	public static int roman(String s) {
		Map<Character, Integer> rValue = new HashMap<>();
		rValue.put('I', 1);
		rValue.put('V', 5);
		rValue.put('X', 10);
		rValue.put('L', 50);
		rValue.put('C', 100);
		rValue.put('D', 500);
		rValue.put('M', 1000);
		int r = 0;
		int pre = 0;
		for (int i=s.length()-1; i>=0; i--) {
			char cuChar = s.charAt(i);
			int cValue = rValue.get(cuChar);
			if (cValue < pre) {
				r -= cValue;
			} 
			else {
				r += cValue;
			}
			pre = cValue;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Roman Number");
		String str = s.next();
		System.out.println(roman(str));
		s.close();
	}

}
