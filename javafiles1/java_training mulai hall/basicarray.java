import java.util.*;
public class basicarray{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 56;
        String name="hari";
        System.out.println(a+name);
        int[] arr = new int[5];
        int[] nan = {4,5,6,7,8};
        System.out.println(nan[1]);
        String[] ar = new String[5];
        String[] ab = {"hari","siva"};
        System.out.println(ar[0]);
        System.out.print(ab[0]+ab[1]);


        //Array of primitive data type
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
       // for(int i = 0; i < arr.length; i++){
       //    System.out.print(arr[i]+" ");
       // }
       //for(int num : arr){
       //     System.out.print(num+" ");
       // }
       System.out.println(Arrays.toString(arr));

       //array of objects
       String[] n = new String[5];
       for(int i = 0; i < n.length; i++){
        n[i] = sc.nextLine();
       }
       System.out.println(Arrays.toString(n));

    }
}