import java.util.*;
import java.lang.*;
import java.io.*;


class Errpalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,c,d=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		c=num;
		while(c!=0)
		{
			b=c%10;
			d=d*10+b;
			c=c/10;
		}
		if(d==num)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
