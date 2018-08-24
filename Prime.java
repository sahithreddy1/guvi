import java.util.*;
class Prime
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
         for(int i=2;i<a;i++)
         {
             if(a%i==0)
             {
                 c=0;
                 break;
             }
            else
            {
                c=1;
            }
         }
         if(c==1)
         {
            System.out.print("yes");
        }
       else
        {
            System.out.print("no");
        }
    }
}
