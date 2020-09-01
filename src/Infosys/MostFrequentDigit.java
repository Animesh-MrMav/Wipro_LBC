package Infosys;
import java.util.*;
public class MostFrequentDigit 
{  public static void main(String[] args)
    {
        Scanner ob =new Scanner(System.in) ;
        System.out.println("Enter 1st no:");
        int n1=ob.nextInt();
        System.out.println("Enter 2nd no:");
        int n2=ob.nextInt();
        System.out.println("Enter 3rd no:");
        int n3=ob.nextInt();
        System.out.println("Enter 4rth no:");
        int n4=ob.nextInt();
        MostFrequentDigit obj=new MostFrequentDigit();
        System.out.println(obj.MostFrequent(n1,n2,n3,n4));
    }
 
   int MostFrequent(int a,int b,int c,int d)
   {   int n[]={a,b,c,d};
       int arr[]={0,0,0,0,0,0,0,0,0,0};
       int i=0;
       while(i<4)
       {
           int no=n[i];
           while(no>0)
           {
               int x= no%10;
               arr[x]++;
               no/=10;
           }
           i++;
       }
       int max=0,j=0;
       for(j=0;j<10;j++)
       { 
         int cnt=arr[j];
         if(cnt>=arr[max])
             max=j;   
       }
        return max;
   }
    
}
