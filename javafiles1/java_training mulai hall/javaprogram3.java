import java.util.*;
  import java.util.ArrayList;
  import java.util.Collections;
  public class javaprogram3 {
  public static void main(String[] args) {
      String n1="4563278987";
      String n2="7689778976";
      int i=n1.length()-1;
      int j=n2.length()-1;
      int s,c=0,d1,d2,d3;
      StringBuilder sum = new StringBuilder();
      StringBuilder a = new StringBuilder();
      while(i>=0&&j>=0){
         d1=n1.charAt(i)-'0';
         d2=n2.charAt(j)-'0';
         d3=d1+d2+c;
         s=d3%10;
         c=d3/10;
         if(i!=0){
          sum.append(s);
         }
         else{
          a.append(d3);
          a.reverse();
          sum.append(a);
         }
         i--;
         j--;
      }
      System.out.println(sum.reverse());
  }
}