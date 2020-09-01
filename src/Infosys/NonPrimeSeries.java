package Infosys;
import java.util.*;
public class NonPrimeSeries
{  
    int IsPrime(int a)
    {   int c=0;
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
                c++;
        }
        if(c==1)
            return 1;
        else
            return 0;
    }
    int NonPrimeSum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {  int f=IsPrime(i);
            if(i==0||i==1||f==0)
                sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {   Scanner ob=new Scanner (System.in);
        NonPrimeSeries obj=new NonPrimeSeries();
        System.out.println("Enter the array size:");
        int s=ob.nextInt();
        int []arr=new int[s];
        System.out.println("Enter the array:");
        for(int i=0;i<s;i++)
            arr[i]=ob.nextInt();
        System.out.println("The sum of elements at non prime index of array is:"+obj.NonPrimeSum(arr));
        
    }
    
    
}
