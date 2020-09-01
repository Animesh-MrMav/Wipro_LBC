package Infosys;
import java.util.*;
import java.lang.*;
public class EncodingArray
{ 
     String str;
     int f,sum=0,l;
     int[] input()
     { Scanner ob=new Scanner(System.in);
       System.out.println("input1:");
       str=ob.next();
       int arr[]=Arrays.stream(str.substring(1, str.length()-1).split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
       System.out.println("input2:");
       int check=ob.nextInt();
       l=arr.length;
       if(l!=check)
       { 
           System.out.println("ERROR WRONG ARRAY SIZE GIVEN");
           System.exit(0); 
       }
       System.out.print("Array is:[");
       for(int j=0;j<l;j++)
             System.out.print(arr[j]+",");
         System.out.println("]");
       return arr;
     }
     EncodingArray findOriginalFirstAndSum(int[] input1,int input2)
     {
         int i;
         for(i=input2-2;i>=0;i--)
         {  input1[i]=input1[i]-input1[i+1];
             
         }
         f=input1[0];
         for(int j=0;j<input2;j++)
         {
             sum=sum+input1[j];
         }
         return this;
     }
     public static void main(String[] args)
    { EncodingArray obj =new EncodingArray();
      EncodingArray obj1 =new EncodingArray();
      int[] arr1=obj.input();
      obj1 = obj.findOriginalFirstAndSum(arr1,obj.l);
      System.out.println("Output1:"+obj1.f);
      System.out.println("Output2:"+obj1.sum);
    }
}
