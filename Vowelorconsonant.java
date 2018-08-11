/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vowelorconsonant
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		System.out.println( " vowel");
		}
		else if(ch=='b' || ch=='c' || ch=='d' || ch=='f' || ch=='g' || ch=='h' || ch=='j' || ch=='k' || ch=='l' || ch=='m' || ch=='n' || ch=='p' || ch=='q' || ch=='r' || ch=='s' || ch=='t' || ch=='v' || ch=='w' || ch=='x' || ch=='y' || ch=='z'){
			
		
		System.out.println( " consonant");
		}
		else
		{
		System.out.println("invalid");
		}
	}
}
		
