/* MyPCS - My Programming Contests Solutions
 *
 * Copyright (C) 2007 - 2012  Fernando Cardoso
 * email: fernandohbc@gmail.com
 * Google+: plus.google.com/117689849496467534996
 *  
 * 
 * SPOILER ALERT!
 * These are the solutions for problems from Programming Contests and Online
 * Judges. Seeing an accepted code before getting accepted by oneself is uncool.
 * 
 * Q: So why are the solutions being made available?
 * A: For educational purposes only. Some of the problems can be used in Contests
 * training (even if it is to show how NOT to do :-) ) and also can serve to
 * compare solutions and algorithms. Also, the author thinks it is cool to have
 * his code well versioned.
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
package volume_ix;

import java.util.Scanner;

/**
 * UVa Online Judge Problem #913 - Joanna and the Odd Numbers
 *
 * @author Fernando Cardoso (fernandohbc@gmail.com)
 */
public class P913_JoannaAndTheOddNumbers {
  public static void main(String [] args) {
    Scanner scn = new Scanner(System.in);
    while (scn.hasNextLong()) {
      long n = scn.nextLong();
      long line = (n+1)/2;
      long idxLast = ((n+1)*line)/2;
      long last = 2 * idxLast - 1;
      long sum = 3 * last - 6;
      System.out.println(sum);
    }
  }
}
