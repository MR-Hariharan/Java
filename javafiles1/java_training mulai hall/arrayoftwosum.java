import java.util.*;
public class arrayoftwosum {
    public static void main (String args[]){
    int a[]={5,6,12,7,8,1,4,3,2,-1,10,9,0};
int target = 9;
int n = a.length;
Arrays.sort(a);
System.out.println(Arrays.toString(a));
for(int i=0;i<n;i++){
   for(int j=i+1;j<n;j++){
      if(a[i]+a[j]==target)
      System.out.println("("+a[i]+ " , "+a[j]+")");
}
}
    }
}
