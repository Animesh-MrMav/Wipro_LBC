package Infosys;
import java.util.*;
public class Series_nth
{    
    int series (int a,int b,int c,int n)
       {
           int arr[]=new int[n];
           arr[0]=a;
           arr[1]=b;
           arr[2]=c;
           for(int i=3;i<n;i++)
           {
             arr[i]=arr[i-1]+(arr[i-2]-arr[i-3]);   
           }
           
           return arr[n-1];       
       }
    public static void main(String[] args)
    { Scanner ob=new Scanner(System.in);
      Series_nth obj=new Series_nth();
        System.out.println("Enter the value of a:");
        int a=ob.nextInt();
        System.out.println("Enter the value of b:");
        int b=ob.nextInt();
        System.out.println("Enter the value of c:");
        int c=ob.nextInt();
        System.out.println("Enter the value of n:");
        int n=ob.nextInt();
        
        System.out.println("The Nth term is:"+obj.series(a, b, c, n));
        
    }
    
    
}
