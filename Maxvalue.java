
    import java.util.*;
 class Maxvalue {
    static int max(int a[][]){
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
              max=Math.max(a[i][j],max);
            }
        }
        return max;
    }
public static void main (String[] args){
    System.out.println("enter some integer:");
    Scanner sc =new Scanner(System.in);
      int row=sc.nextInt();
     int col=sc.nextInt();
      int a[][] =new int[row][col]; 
     // int a[][]={{12,24,3},{5,6,9},{34,78,96}};  
          int max_element=max(a);
      System.out.println(max_element);
}
    }


