/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Amstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c=0;
       int d=a;
        while(a>0)
        {
            b=a%10;
            a=a/10;
            c=c+(b*b*b);
        }
        if(d==c)
        {
        System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        }
	}
