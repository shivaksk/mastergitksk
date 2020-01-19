package com.shiva.Funcation;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {

		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Char = str.substring(2);

		System.out.println("First Two : " + first2Chars + " Strn");
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Char;

	}

	public boolean areFirstAndLastTwoCharsSame(String str) {

		System.out.println(str);
		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String firstTwoChars = str.substring(0, 2);

		String lastTwoChars = str.substring(str.length() - 2);

		System.out.println("FirstTwoChars : " + firstTwoChars + "   lastTwoChars : " + lastTwoChars);
		return firstTwoChars.equals(lastTwoChars);
	}

	public static void main(String[] args) {
		StringHelper helper = new StringHelper();
		System.out.println(helper.areFirstAndLastTwoCharsSame("SHA"));
	}
}
