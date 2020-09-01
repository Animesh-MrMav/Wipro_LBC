package Infosys;
import java.util.*;
public class Farah_PIN 
{
   int PIN_generator(String str)
   {  int p=0;
      String arr[]=str.split(" ");
      int len=arr.length;
      for(int i=0;i<len;i++)
      {
          p+=arr[i].length();
      }
       while(p>9)
       {  int sum=0;
           while(p>0)
           {  sum+=p%10;
              p/=10;
           }
           p=sum;
           
       }
       return p;   
   }
    public static void main(String[] args)
    {   
        Farah_PIN obj=new Farah_PIN();
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=ob.nextLine();
        System.out.println("PIN: "+obj.PIN_generator(str));
    }
}
