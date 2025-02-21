import java.util.*;
public class arrayleader{
    public static void main (String[]args){
                int [] a = {10, 20, 5, 6, 12, 8, 13};
                int b =a.length;
                for (int i = 0 ; i < b ; i++){
                    for (int j = i+1; j<b; j++){
                        if(a[i] > a[j] ){
                            System.out.print(a[i] + " ");
                        }     
                        break;                   
                    }  
                }
                    System.out.print(a[b- 1]);        
            }
            
        }
