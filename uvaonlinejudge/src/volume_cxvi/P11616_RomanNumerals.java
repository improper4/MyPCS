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
package volume_cxvi;

import java.util.Scanner;

/**
 * UVa Online Judge Problem #11616 - Roman Numerals
 * 
 * @author Fernando Cardoso (fernandohbc@gmail.com)
 */
public class P11616_RomanNumerals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextLine()) {
            String line = scn.nextLine();
            if (line.matches("[0-9]*")) {
                System.out.println(toRoman(Integer.parseInt(line)));
            } else {
                System.out.println(toArabic(line));
            }
        }
    }

    private static int toArabic(String line) {
        char[] charray = line.toCharArray();
        int result = 0;
        int i = 0;
        for (; i < charray.length - 1; i++) {
            int cValue = getValue(charray[i]);
            int nValue = getValue(charray[i + 1]);
            if (cValue < nValue) {
                result += nValue - cValue;
                i++;
            } else {
                result += cValue;
            }
        }
        if (i < charray.length) {
            result += getValue(charray[i]);
        }
        return result;
    }

    private static int getValue(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }

    private static String toRoman(int i) {
        StringBuilder sb = new StringBuilder();

        int mils = i / 1000;
        append(sb, mils, 1000);

        int cents = (i / 100) % 10;
        append(sb, cents, 100);

        int tens = (i / 10) % 10;
        append(sb, tens, 10);

        int ones = i % 10;
        append(sb, ones, 1);

        return sb.toString();
    }

    private static void append(StringBuilder sb, int value, int multiplier) {
        while (value > 0) {
            if (value == 9) {
                sb.append(getChar(multiplier));
                sb.append(getChar(multiplier * 10));
                value = 0;
            } else if (value >= 5) {
                sb.append(getChar(multiplier * 5));
                value -= 5;
            } else if (value == 4) {
                sb.append(getChar(multiplier));
                sb.append(getChar(multiplier * 5));
                value = 0;
            } else {
                sb.append(getChar(multiplier));
                value--;
            }
        }
    }

    private static char getChar(int i) {
        switch (i) {
        case 1:
            return 'I';
        case 5:
            return 'V';
        case 10:
            return 'X';
        case 50:
            return 'L';
        case 100:
            return 'C';
        case 500:
            return 'D';
        case 1000:
            return 'M';
        default:
            return '0';
        }
    }
}
