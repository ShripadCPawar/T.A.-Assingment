// Question 2 : 

import java.util.*;
 
class Pyramid2{
 public static void main(String args[])
 {
 int i,j;
 int n=5,k=1;
 
     
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=i;j++,k++)
         {
             System.out.printf("%4c",(char)(k+64));
         }
 
        System.out.println("");
     }
 }
}
