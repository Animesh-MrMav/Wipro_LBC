package Infosys;
import java.util.*;
import java.lang.*;
public class Add_sub 
{
    int AddSub(int n,int opt)
    {   int sum=n;
        while(n>0 )
        {  n=n-1;
           sum=sum+((int)Math.pow(-1,opt++)*(n)) ;
        }
        return sum;
    }
    public static void main(String[] args)
    { Scanner ob=new Scanner (System.in);
      Add_sub obj=new Add_sub();
      System.out.println("Enter the value of N:");
      int N=ob.nextInt();
      System.out.println("Enter the value of opt:");
      int opt=ob.nextInt();
      
        System.out.println("The Sum is :"+obj.AddSub(N, opt));
      
    }
}
