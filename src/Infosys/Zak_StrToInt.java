package Infosys;
import java.util.*;
public class Zak_StrToInt
{ 
    int encode(String str)
    {   String arr[]=str.toUpperCase().split(" ");
        String res="";
        for(int i=0;i<arr.length;i++)
        {  
            res+=String.valueOf(word_to_int(arr[i]));
        }
      
        return Integer.valueOf(res);
    }
    int word_to_int(String wd)
    {
        String letter=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len=wd.length();
        int r=0;
     
           for(int i=0;i<len/2;i++) 
               r+=(int)Math.abs(letter.indexOf(wd.charAt(i))-letter.indexOf(wd.charAt(len-1-i)));
         if(len%2==1)
        {
           r+=letter.indexOf(wd.charAt(len/2));
        }
         System.out.println(r);
         return r;
    }
    public static void main(String[] args)
    {
        Zak_StrToInt obj=new Zak_StrToInt();
        Scanner ob=new Scanner(System.in) ;
        System.out.println("Enter the string:");
        String str=ob.nextLine();
        int r=obj.encode(str);
        System.out.println(r);
    }
}
