
import java.util.*;
public class arrayprogram {
 public static void main (String args[]){
   /*  int  [] arr = {1,2,3,4};
    int n = arr.length;
    for(int i=0;i<n/2;i++){
       int t =arr[i];
       arr[i]=arr[n-1-i];
       arr[n-1-i]=t;
      }
       System.out.println(" "+Arrays.toString(arr));
    } */

    //reverse using Collectios.revervse
    /*Integer [] h = {1,2,3,4,5,6,7,8,9,10};
    Collections.reverse(Arrays.asList(h));
       System.out.println(Arrays.asList(h));
    } 
    */
/*int a[] ={15,6,7,0,8,9,0};
int temp=0;
int b=0;
   for(int i=0;i<a.length;i++){
    //  for (int j=i+1;j<a.length;j++){
         if(a[i]!=0)
         temp = a[i];
         System.out.println(temp);
 }
         */
        /*int a[] ={5,7,2,11};
        int n = 9;
   for(int i=0;i<a.length-1;i++){
    for (int j=i+1;j<a.length;j++){
         if(a[i]+a[j]==n) {
            System.out.println(i+","+j);
          return;
         }
      }
   }*/
   
   /*int a[] ={5,7,2,11};
   int temp=a[a.length-1];
   System.out.println(temp);
   for(int i=a.length-2;i>= 0;i--){
   a[i+1]=a[i];
   }
   a[0]=temp;
   for(int i=0;i<a.length;i++)
   {
      System.out.print(a[i]);
   }*/
 
 /*   int a[]={1,2,3,4,5,6,7,8,9};
  int n=a.length;
  int sum=0;
  for(int i=0;i<n;i++){
   sum=sum+a[i];
}
   System.out.println(sum); 
   */
  /*int a[]={1,2,3,4,5,6,7,8,9};
  int n=a.length;
  int sum=0;
  for(int i=0;i<n;i++){
   if(i%2==0)
   sum+=a[i];
}
   System.out.println(sum); 
   */
  int a[]={1,2,3,4,5,6,7,8,9};
  int n=a.length;
  int sum=0;
  for(int i=0;i<n;i++){
   if(i%2!=0)
   sum+=a[i];
}
   System.out.println(sum); 
}
}




