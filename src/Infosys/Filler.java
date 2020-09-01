package Infosys;
import java.util.*;
public class Filler 
{ 
    public static void main(String[] args)
    {   
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Input String1:");
        String i1=ob.next();
        System.out.println("Enter Input String2:");
        String i2=ob.next();
        Filler obj=new Filler();
        obj.identifyPossibleWords(i1,i2);
         
    }
    void identifyPossibleWords(String in1,String in2)
    {  in1=in1.toUpperCase();
       in2=in2.toUpperCase();
       String o="";
       String arr[]=in2.split(":");
       int l =in1.length();
       int l1=arr.length;
       int i=0,f=1,c=0;
       for(int j=0;j<l1;j++)
       {   f=1;i=0;
           while(i<l)
         { 
            if(in1.charAt(i)=='_')
            {
                 i=i+1;
                continue;
               
            }
            else
             {
                if(in1.charAt(i)!=arr[j].charAt(i))
                { f=-1;
                  break;
               }
             }
            i++;
          }
        if(f==1)
        { o=o+arr[j]+":";
          c++;
        }
       } 
       if(c==0)
           System.out.println("ERROR-009");
       else
           System.out.println(o.toUpperCase());
    } 
}
