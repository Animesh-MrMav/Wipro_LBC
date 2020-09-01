package Infosys;
import java.util.*;
import java.lang.*;
public class EncodingJJJ
{ 
    String in[]=new String[3];
    void input()
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("Input1:");
        in[0]=ob.next();
        System.out.println("Input2:");
        in[1]=ob.next();
        System.out.println("Input3:");
        in[2]=ob.next();
    }
    void print()
    {  String f[]=new String[3],m[]=new String[3],la[]=new String[3];
       int l[]=new int[3];
       l[0]=in[0].length();
       l[1]=in[1].length();
       l[2]=in[2].length();
       for(int j=2;j>=0;j--)
       {  int d=l[j]/3;
          if(l[j]%3==2)
          {
              d++;
          }
          f[j]=in[j].substring(0, d);
          m[j]=in[j].substring(d,l[j]-d);
          la[j]=in[j].substring(l[j]-d);
           
       }
       String op[]=new String[3];
       op[0]=f[0]+f[1]+f[2];
       op[1]=m[0]+m[1]+m[2];
       op[2]=toggle(la[0]+la[1]+la[2]);
       System.out.println("Output1:"+op[0]);
       System.out.println("Output2:"+op[1]);
       System.out.println("Output3:"+op[2]);
        
    }
    String toggle(String str)
    {
        int i=0,l=str.length();
        String cpy="";
        for(i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                cpy=cpy+Character.toUpperCase(ch);
            }
            if(Character.isUpperCase(ch))
            {
                cpy=cpy+Character.toLowerCase(ch);
            }
        }
        return cpy;
    }
    public static void main(String[] args)
    { EncodingJJJ obj=new EncodingJJJ();
      obj.input();
      obj.print();
        
    }
}
