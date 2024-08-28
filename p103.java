//Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits

import java.util.*;

public class p103 {    
      public static void main(String[] args)
      {
             Scanner sc=new Scanner(System.in);
             int no=sc.nextInt();
              String bin="";
             
              while(no!=0)
               {
                      bin=(no&1)+bin;
                      no=no>>1;
               }
                bin=bin.replaceAll("1","2");
                bin=bin.replaceAll("0","1");
                bin=bin.replaceAll("2","0");
                int res=Integer.parseInt(bin,2);
               System.out.println(res);
       }  
}
