package repl.its;

import java.util.Scanner;

public class A60_PrintLastCharacter {

	public static void main(String[] args) {
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	  System.out.println(word.substring(word.length()-1));
	}

}