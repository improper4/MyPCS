/*
 * MyPCS - My Programming Contests Solutions
 * 
 * Copyright (C) 2007 - 2011  Fernando Cardoso
 * email: fernandohbc@gmail.com / twitter: fernando_hbc
 * 
 * The source code of this program is free software; you can do whatever you
 * want with it since you always keep the name and contact of the original
 * author. Also, if you redistribute a modified version, make sure you explicit
 * the portions of the code that have been modified.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. In other words, use it
 * at your own risk.
 * 
 * If you find this a little useful, you can buy the author some beer.
 * If you find this really useful, you can buy a kid a book, and help making
 * the world more literate.
 */
// @JUDGE_ID:  33089  673  Java  "Parentheses Balance"
package volume_vi;

class P673_33089 {
	//	Rotina de Leitura
	static String readLn() {
		String newLine = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		int car = -1;
		try {
			car = System.in.read();
			while ((car > 0) && (car != newLine.charAt(0))) {
				buffer.append((char) car);
				car = System.in.read();
			}
			if (car == newLine.charAt(0))
				System.in.skip(newLine.length() - 1);
		} catch (java.io.IOException e) {
			return (null);
		}
		if ((car < 0) && (buffer.length() == 0))
			return (null);
		return (buffer.toString().trim());
	}

	public static void main(String[] args) {
		(new P673_33089()).begin();
	}

	private void begin() {
		int tc = Integer.parseInt(readLn());
		for ( int i = 0; i < tc; i++ ) {
			String input = readLn();
			System.out.println(balance(input));
		}
	}

	private String balance(String input) {
		int tam = input.length();
		char stack[] = new char[tam];
		int top = 0;
		for ( int i = 0; i < tam; i++ ) {
			char c = input.charAt(i);
			if ( c == '(' || c == '[') {
				stack[top] = c;
				top++;
			} else if ( top == 0 ) {
				return "No";
			} else {
				char topChar = stack[top - 1];
				if ( ( c == ')' && topChar == '(' ) || ( c == ']' && topChar == '[' ) ) {
					top--;
				} else {
					return "No";
				}
			}
		}
		if ( top == 0 ) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
